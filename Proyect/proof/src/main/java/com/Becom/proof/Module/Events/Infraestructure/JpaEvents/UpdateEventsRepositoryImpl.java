package com.Becom.proof.Module.Events.Infraestructure.JpaEvents;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Events.Domain.Repository.UpdateEventsRepository;
import com.Becom.proof.Module.Events.Infraestructure.EventsMapper.EventsMapper;
import com.Becom.proof.Module.Models.Events;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@AllArgsConstructor
public class UpdateEventsRepositoryImpl implements UpdateEventsRepository {

    private final JpaEvents je;
    private final EventsMapper em;
    @Override
    public Optional<EventsDTO> updateEvents(Events events) {

        return Optional.ofNullable(em.eventsToEventDTO(je.save(events)));
    }
}
