package com.example.btl_mobile_be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.btl_mobile_be.model.entity.Event;
import com.example.btl_mobile_be.model.service.EventService;

@RestController
@RequestMapping("/event")
public class EventController {
	@Autowired
    private EventService eventService;
	
	@PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvent() {
        return eventService.getAllEvent();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable int id) {
        return eventService.getEventById(id);
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable int id, @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }

    @DeleteMapping("/{id}")
    public boolean deleteEvent(@PathVariable int id) {
    	return eventService.deleteEvent(id);
    }
    
    @GetMapping("/next30days")
	public List<Event> getEventsWithinNext30Days() {
		return eventService.getEventsWithinNext30Days();
	}
    
    @GetMapping("/today")
	public List<Event> getEventsToday() {
		return eventService.getEventsToday();
	}
}

