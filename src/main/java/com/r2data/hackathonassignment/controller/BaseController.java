package com.r2data.hackathonassignment.controller;

import com.r2data.hackathonassignment.common.dto.ResponseDto;
import com.r2data.hackathonassignment.utils.ResponseDtoUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Slf4j
public abstract class BaseController {


    /**
     * Will return ResponseEntity with given body and message in a SuccessResponseDto and all other default values.
     * Will set HttpStatus as OK.
     */
    protected <T> ResponseEntity<ResponseDto> getSuccessResponseEntityWithDataAndMessage(T data,
                                                                                         String message) {
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDtoUtils.getSuccessResponseDtoWithDataAndMessage(data, message));
    }

    protected <T> ResponseEntity<ResponseDto> getErrorResponseEntityWithDataAndMessage(T data,
                                                                                       String message) {
        return ResponseEntity.status(HttpStatus.OK).body(ResponseDtoUtils.getErrorResponseDtoWithErrorData(message, data));
    }
}
