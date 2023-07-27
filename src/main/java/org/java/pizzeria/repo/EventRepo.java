package org.java.pizzeria.repo;

import org.java.pizzeria.pojo.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepo extends JpaRepository<Event, Integer> {

}
