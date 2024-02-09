package org.example.ngo_project.Controller;

import com.example.NgoApplication.Services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

/*    @PostMapping
    public ResponseEntity<Event> createEvent(@RequestBody Event event){
        Event createdEvent =eventService.createEvent(event);
        return new ResponseEntity<>(createdEvent, HttpStatus.CREATED);
    }*/
}
