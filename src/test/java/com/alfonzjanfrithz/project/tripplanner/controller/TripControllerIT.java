package com.alfonzjanfrithz.project.tripplanner.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class TripControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TripController tripController;

    @Test
    @DisplayName("Context loading should be succesfull")
    public void contextLoads() {
        assertThat(tripController).isNotNull();
    }

    @Test
    @DisplayName("Retrieving all trips should return success response")
    public void shouldReturnSuccessResponse() throws Exception {
        mockMvc.perform(get("/trips"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}