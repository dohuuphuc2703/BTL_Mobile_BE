package com.example.btl_mobile_be.model.serviceImpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.btl_mobile_be.model.entity.Event;
import com.example.btl_mobile_be.model.service.EventService;
import com.example.btl_mobile_be.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventRepository eventRepository;
	
	@Override
	public Event createEvent(Event event) {
        return eventRepository.save(event);
    }
	@Override
	public Event updateEvent(int id, Event event) {
		event.setId(id);
        return eventRepository.save(event);
    }
	@Override
	public boolean deleteEvent(int id) {
        eventRepository.deleteById(id);
        return true;
    }
	@Override
	public Event getEventById(int id) {
		return eventRepository.findById(id).orElse(null);
	}
	@Override
	public List<Event> getAllEvent() {
        return eventRepository.findAll();
    }
	
	@Override
	public List<Event> getEventsWithinNext30Days() {
		LocalDate currentDate = LocalDate.now();
		LocalDate startDate = currentDate.plusDays(1);
		LocalDate endDate = currentDate.plusDays(30);
		Sort sortByDateAsc = Sort.by("date").ascending();
		return eventRepository.findByDateBetween(startDate, endDate, sortByDateAsc);
	}
	
	@Override
	public List<Event> getEventsToday() {
		LocalDate currentDate = LocalDate.now();
		return eventRepository.findByDate(currentDate);
	}
}
