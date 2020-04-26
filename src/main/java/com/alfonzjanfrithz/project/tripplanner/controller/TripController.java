package com.alfonzjanfrithz.project.tripplanner.controller;

import com.alfonzjanfrithz.project.tripplanner.api.TripsApi;
import com.alfonzjanfrithz.project.tripplanner.model.Trip;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.Collections;
import java.util.List;

@Controller
public class TripController implements TripsApi {
    @Override
    public ResponseEntity<List<Trip>> searchTrips() {
        return ResponseEntity.ok(Collections.emptyList());
    }
}
