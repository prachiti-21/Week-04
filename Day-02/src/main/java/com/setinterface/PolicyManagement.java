package com.setinterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class PolicyManagement {
    int policyNumber;
    String policyHolderName;
    String expiryDate;
    String coverageType;
    double premiumAmount;
    PolicyManagement(){
        this.policyNumber=policyNumber;
        this.policyHolderName=policyHolderName;
        this.expiryDate=expiryDate;
        this.coverageType=coverageType;
        this.premiumAmount=premiumAmount;
    }
    HashSet<Integer>policynum=new HashSet<>();
    LinkedHashSet<String>names=new LinkedHashSet<>();
    TreeSet<String>dates=new TreeSet<>();
    public void addPolicyNumber(){
        policynum.add(policyNumber);
    }
}
