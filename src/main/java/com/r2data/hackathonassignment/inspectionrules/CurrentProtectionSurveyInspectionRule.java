package com.r2data.hackathonassignment.inspectionrules;

import com.r2data.hackathonassignment.utils.ParseRequiredTasks;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class CurrentProtectionSurveyInspectionRule implements InspectionRule {

    private final ParseRequiredTasks parseRequiredTasks;

    @Override
    public String inspectionRule(String requiredTasks) {
        String rules = parseRequiredTasks.getRules(requiredTasks);
        log.info("#Got rules:"+rules);
        return rules;
    }

    @Override
    public InspectionType getInspectionType() {
        return InspectionType.CURRENT_PROTECTION_SURVEY;
    }
}
