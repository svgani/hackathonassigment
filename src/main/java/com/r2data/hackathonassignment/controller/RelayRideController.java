package com.r2data.hackathonassignment.controller;

import com.r2data.hackathonassignment.common.dto.ResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class RelayRideController extends BaseController {

    @GetMapping(path = "/ride")
    public ResponseEntity<ResponseDto> ride() {
        log.info("#ping is called");
        return getSuccessResponseEntityWithDataAndMessage(null,"pong");
    }

}
