package com.alfonzjanfrithz.project.tripplanner.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class TripService {
    public String getServices() {
        log.info("Testing logging, some logs should be here");
        return "all services should be returned here";
    }
}
