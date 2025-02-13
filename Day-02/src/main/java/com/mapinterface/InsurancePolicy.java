package com.mapinterface;

import java.util.*;
import java.time.*;

// Class representing an Insurance Policy
class InsurancePolicy {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;

    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Holder: " + policyholderName + ", Expiry: " + expiryDate;
    }
}

// Class for managing insurance policies
class InsurancePolicyManager {
    private Map<String, InsurancePolicy> policyMap = new HashMap<>();
    private LinkedHashMap<String, InsurancePolicy> orderedPolicyMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<InsurancePolicy>> expirySortedPolicies = new TreeMap<>();

    // Add a policy
    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.policyNumber, policy);
        orderedPolicyMap.put(policy.policyNumber, policy);
        expirySortedPolicies.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
    }

    // Retrieve a policy by its number
    public InsurancePolicy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<InsurancePolicy> getExpiringPolicies() {
        LocalDate today = LocalDate.now();
        LocalDate cutoffDate = today.plusDays(30);
        List<InsurancePolicy> expiringPolicies = new ArrayList<>();

        for (Map.Entry<LocalDate, List<InsurancePolicy>> entry : expirySortedPolicies.headMap(cutoffDate, true).entrySet()) {
            expiringPolicies.addAll(entry.getValue());
        }

        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<InsurancePolicy> getPoliciesByHolder(String policyholderName) {
        List<InsurancePolicy> result = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.policyholderName.equalsIgnoreCase(policyholderName)) {
                result.add(policy);
            }
        }
        return result;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, List<InsurancePolicy>>> iterator = expirySortedPolicies.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<LocalDate, List<InsurancePolicy>> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                for (InsurancePolicy policy : entry.getValue()) {
                    policyMap.remove(policy.policyNumber);
                    orderedPolicyMap.remove(policy.policyNumber);
                }
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();
        manager.addPolicy(new InsurancePolicy("P001", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new InsurancePolicy("P002", "Bob", LocalDate.now().plusDays(40)));
        manager.addPolicy(new InsurancePolicy("P003", "Alice", LocalDate.now().plusDays(20)));

        System.out.println("Expiring Policies: " + manager.getExpiringPolicies());
        System.out.println("Alice's Policies: " + manager.getPoliciesByHolder("Alice"));

        manager.removeExpiredPolicies();
        System.out.println("Policies after removing expired ones: " + manager.policyMap.values());
    }
}

