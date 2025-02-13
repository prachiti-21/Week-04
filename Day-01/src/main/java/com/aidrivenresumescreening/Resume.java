package com.aidrivenresumescreening;

class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public void processResume() {
        System.out.println("Processing Resume for: " + jobRole.getCandidateName() + " | Role: " + jobRole.getJobRole());
        if (jobRole.isEligible()) {
            System.out.println("✅ Resume Approved!");
        } else {
            System.out.println("❌ Resume Rejected!");
        }
        System.out.println("-----------------------------");
    }

    public T getJobRole() {
        return jobRole;
    }
}