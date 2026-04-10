package com.resume.backend.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.resume.backend.ResumeRequest;
import com.resume.backend.service.ResumeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException; // ✅ important import

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/resume")
public class ResumeController {

    private final ResumeService resumeService;

    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping("/generate")
    public ResponseEntity<JSONPObject> getResumeData(
            @RequestBody ResumeRequest resumeRequest
    ) throws IOException {   // ✅ yahi fix hai

        JSONPObject response = resumeService.generateResumeResponse(
                resumeRequest.userDescription()
        );

        return ResponseEntity.ok(response);
    }
}