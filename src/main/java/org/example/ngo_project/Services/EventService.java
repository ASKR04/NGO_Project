package org.example.ngo_project.Services;

import org.example.ngo_project.Repository.EventRepository;
import org.example.ngo_project.model.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EventService {
    private final EventRepository eventRepository;
    @Autowired
    public EventService(EventRepository eventRepository){
       this.eventRepository = eventRepository;
    }
    public Event createEvent(Event event){
        return eventRepository.save((event));
    }
    public Optional<Event> getEventById(Long eventId){
        return eventRepository.findById(eventId);
    }
    public List<Event> getAllEvents(){
        return eventRepository.findAll();
    }
    public void updateEvent(Event updatedEvent){
        eventRepository.save(updatedEvent);
    }
    public void deactivateEvent(Long eventId){
        eventRepository.deleteById(eventId);
    }
}
