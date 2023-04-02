package com.r2data.hackathonassignment.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InspectionBean {

    private String inspection;
    private String requiredTasks;
    private String rules;

}
