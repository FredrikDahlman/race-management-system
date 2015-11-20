package se.cag.labs.currentrace.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.cag.labs.currentrace.CurrentRaceRepository;

@Service
public class CancelRaceService {
    @Autowired
    private CurrentRaceRepository repository;

    public String cancelRace() {
        return "Cancelling race";
    }
}
