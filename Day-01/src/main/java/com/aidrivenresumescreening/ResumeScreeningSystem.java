package com.aidrivenresumescreening;
import java.util.*;
class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumeList = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        resumeList.add(resume);
    }

    // Generic method to screen candidates dynamically
    public <T extends JobRole> void screenCandidate(T candidate) {
        System.out.println("AI Screening Candidate: " + candidate.getCandidateName() + " for " + candidate.getJobRole());
        if (candidate.isEligible()) {
            System.out.println("Candidate Passed Screening.");
        } else {
            System.out.println("Candidate Did Not Meet Criteria.");
        }
        System.out.println("-----------------------------");
    }

    // Display all resumes processed
    public void processAllResumes() {
        for (Resume<? extends JobRole> resume : resumeList) {
            resume.processResume();
        }
    }
}
