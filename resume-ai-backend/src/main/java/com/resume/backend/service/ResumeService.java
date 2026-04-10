package com.resume.backend.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import netscape.javascript.JSObject;

import java.io.IOException;

public interface ResumeService {

    JSONPObject generateResumeResponse(String userResumeDescription) throws IOException;
}
