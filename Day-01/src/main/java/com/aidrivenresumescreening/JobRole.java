package com.aidrivenresumescreening;

import java.util.ArrayList;
import java.util.List;

// Abstract class representing a job role
abstract class JobRole {
    protected String candidateName;
    protected int experienceYears;
    protected List<String> skills;

    public JobRole(String candidateName, int experienceYears, List<String> skills) {
        this.candidateName = candidateName;
        this.experienceYears = experienceYears;
        this.skills = skills;
    }

    public abstract boolean isEligible();  // Abstract method for screening

    public String getCandidateName() {
        return candidateName;
    }

    public String getJobRole() {
        return this.getClass().getSimpleName();
    }
}

// Concrete Job Roles
/*class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experienceYears, List<String> skills) {
        super(candidateName, experienceYears, skills);
    }

    @Override
    public boolean isEligible() {
        return experienceYears >= 2 && skills.contains("Java") && skills.contains("Algorithms");
    }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experienceYears, List<String> skills) {
        super(candidateName, experienceYears, skills);
    }

    @Override
    public boolean isEligible() {
        return experienceYears >= 3 && skills.contains("Python") && skills.contains("Machine Learning");
    }
}

class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears, List<String> skills) {
        super(candidateName, experienceYears, skills);
    }

    @Override
    public boolean isEligible() {
        return experienceYears >= 4 && skills.contains("Leadership") && skills.contains("Strategy");
    }
}

// Generic Resume class
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

// AI-Driven Resume Screening System
class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumeList = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        resumeList.add(resume);
    }

    // Generic method to screen candidates dynamically
    public <T extends JobRole> void screenCandidate(T candidate) {
        System.out.println("AI Screening Candidate: " + candidate.getCandidateName() + " for " + candidate.getJobRole());
        if (candidate.isEligible()) {
            System.out.println("✅ Candidate Passed Screening.");
        } else {
            System.out.println("❌ Candidate Did Not Meet Criteria.");
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

// Main class to test the system
public class ResumeScreeningAI {
    public static void main(String[] args) {
        ResumeScreeningSystem aiSystem = new ResumeScreeningSystem();

        // Creating candidate resumes
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Alice", 3, List.of("Java", "Algorithms", "Spring")));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Bob", 2, List.of("Python", "SQL")));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Charlie", 5, List.of("Leadership", "Strategy", "Agile")));

        // Adding resumes to AI system
        aiSystem.addResume(seResume);
        aiSystem.addResume(dsResume);
        aiSystem.addResume(pmResume);

        // Processing all resumes
        aiSystem.processAllResumes();

        // AI Screening individual candidates
        aiSystem.screenCandidate(new SoftwareEngineer("David", 4, List.of("Java", "Algorithms", "Spring Boot")));
        aiSystem.screenCandidate(new DataScientist("Eva", 5, List.of("Python", "Machine Learning", "Deep Learning")));
    }
}*/

