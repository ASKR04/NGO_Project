package org.example.ngo_project.Controller;

import org.example.ngo_project.Services.EventService;
import org.example.ngo_project.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class EventController {

    @Autowired
    private EventService eventService;

    @CrossOrigin(origins ="http://localhost:3000", maxAge = 3600)
    @PostMapping ("/event")
    public ResponseEntity<Event> createEvent(@RequestBody Event event){
        Event createdEvent = eventService.createEvent(event);
        return new ResponseEntity<>(createdEvent, HttpStatus.CREATED);
    }
    @GetMapping("/events")
    @CrossOrigin("http://localhost:8080/events")
    public ResponseEntity<List<Event>> getAllEvents(){
        List<Event> events = eventService.getAllEvents();
        return new ResponseEntity<>(events, HttpStatus.OK);
    }
}
