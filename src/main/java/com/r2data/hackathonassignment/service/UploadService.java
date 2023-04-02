package com.r2data.hackathonassignment.service;

import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    public boolean upload(MultipartFile file);
}
