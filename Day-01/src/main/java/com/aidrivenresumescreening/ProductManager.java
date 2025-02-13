package com.aidrivenresumescreening;
import java.util.*;
class ProductManager extends JobRole {
    public ProductManager(String candidateName, int experienceYears, List<String> skills) {
        super(candidateName, experienceYears, skills);
    }

    @Override
    public boolean isEligible() {
        return experienceYears >= 4 && skills.contains("Leadership") && skills.contains("Strategy");
    }
}

