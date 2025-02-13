package com.aidrivenresumescreening;
import java.util.*;
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName, int experienceYears, List<String> skills) {
        super(candidateName, experienceYears, skills);
    }

    @Override
    public boolean isEligible() {
        return experienceYears >= 2 && skills.contains("Java") && skills.contains("Algorithms");
    }
}

