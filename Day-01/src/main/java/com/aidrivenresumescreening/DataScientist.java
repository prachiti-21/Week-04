package com.aidrivenresumescreening;
import java.util.*;
class DataScientist extends JobRole {
    public DataScientist(String candidateName, int experienceYears, List<String> skills) {
        super(candidateName, experienceYears, skills);
    }

    @Override
    public boolean isEligible() {
        return experienceYears >= 3 && skills.contains("Python") && skills.contains("Machine Learning");
    }
}
