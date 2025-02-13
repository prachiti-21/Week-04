package com.aidrivenresumescreening;
import java.util.*;
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
}
