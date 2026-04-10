package com.resume.backend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.resume.backend.service.ResumeService;

import java.io.IOException;

@SpringBootTest
class ResumeAiBackendApplicationTests {

    @Autowired
    private ResumeService resumeService;

	@Test
	void contextLoads() throws IOException {
        resumeService.generateResumeResponse("I am Ruchit");
	}

}
