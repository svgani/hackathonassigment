package com.r2data.hackathonassignment.common.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
public class MissingSomeBean {
    @JsonProperty("missing_some")
    public ArrayList<Object> missingSome;

}
