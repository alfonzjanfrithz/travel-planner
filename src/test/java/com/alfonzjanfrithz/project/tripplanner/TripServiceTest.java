package com.alfonzjanfrithz.project.tripplanner;

import com.alfonzjanfrithz.project.tripplanner.service.TripService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TripServiceTest {
    @Autowired
    private TripService tripService;

    @Test
    @DisplayName("getService should return all services")
    public void shouldReturnAllServices() {
        String services = tripService.getServices();
        assertThat(services).isEqualTo("all services should be returned here");
    }
}