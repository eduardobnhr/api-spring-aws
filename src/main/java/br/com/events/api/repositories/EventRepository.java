package br.com.events.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.events.api.domain.eventos.Event;

public interface EventRepository extends JpaRepository<Event, UUID>{
    
}
