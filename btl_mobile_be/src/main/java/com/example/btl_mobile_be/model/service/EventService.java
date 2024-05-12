package com.example.btl_mobile_be.model.service;

import java.util.List;

import com.example.btl_mobile_be.model.entity.Event;

public interface EventService {
	Event createEvent(Event event);
	Event updateEvent(int id, Event event);
	Event getEventById(int id);
	boolean deleteEvent(int id);
	List<Event> getAllEvent();
	List<Event> getEventsToday();
	List<Event> getEventsWithinNext30Days();
}
