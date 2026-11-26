package com.example.ProjectCICD;

import com.example.ProjectCICD.controller.DemoController;
import jakarta.servlet.ServletException;
import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class DemoControllerTest {

    private final MockMvc mockMvc = MockMvcBuilders
            .standaloneSetup(new DemoController())
            .build();

    // TC01 - Verify successful response
    @Test
    void testDemoSuccess() throws Exception {

        mockMvc.perform(get("/api/demo")
                        .param("name", "siddu"))
                .andExpect(status().isOk())
                .andExpect(content().string("successful"));
    }

    // TC02 - Verify failure response
    @Test
    void testDemoFailure() {

        ServletException exception = assertThrows(
                ServletException.class,
                () -> mockMvc.perform(get("/api/demo")
                        .param("name", "fail"))
        );

        assertEquals("Failed",
                exception.getRootCause().getMessage());
    }

    // TC03 - Verify case-insensitive failure
    @Test
    void testDemoUppercaseFailure() {

        ServletException exception = assertThrows(
                ServletException.class,
                () -> mockMvc.perform(get("/api/demo")
                        .param("name", "FAIL"))
        );

        assertEquals("Failed",
                exception.getRootCause().getMessage());
    }

    // TC04 - Verify missing request parameter
    @Test
    void testMissingName() throws Exception {

        mockMvc.perform(get("/api/demo"))
                .andExpect(status().isBadRequest());
    }
}