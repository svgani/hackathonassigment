package com.r2data.hackathonassignment.inspectionrules;

public interface InspectionRule {
    String inspectionRule(String requiredTasks);
    InspectionType getInspectionType();
}
