package com.example.btl_mobile_be.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.btl_mobile_be.model.entity.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {
	List<Event> findByDateBetween(LocalDate startDate, LocalDate endDate, Sort sort);
	List<Event> findByDate(LocalDate date);
}
