package org.java.pizzeria.services;

import java.util.List;
import java.util.Optional;

import org.java.pizzeria.pojo.Event;
import org.java.pizzeria.repo.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
	@Autowired
	private EventRepo eventRepo;
	
	public List<Event> findAll(){
		return eventRepo.findAll();
	}
	
	public Event save(Event event) {
		return eventRepo.save(event);
	}
	
	public Optional<Event> findById(int id){
		return eventRepo.findById(id);
	}
	
	public void deltById(int id) {
		eventRepo.deleteById(id);;
	}
}
