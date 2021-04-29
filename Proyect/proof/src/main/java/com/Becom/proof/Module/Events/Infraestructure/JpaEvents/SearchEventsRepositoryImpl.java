package com.Becom.proof.Module.Events.Infraestructure.JpaEvents;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Events.Domain.Repository.SearchEventsRepository;
import com.Becom.proof.Module.Events.Infraestructure.EventsMapper.EventsMapper;
import com.Becom.proof.Module.Events.Infraestructure.JpaEvents.JpaEvents;
import com.Becom.proof.Module.Models.Events;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@AllArgsConstructor
public class SearchEventsRepositoryImpl implements SearchEventsRepository {
    private final JpaEvents je;
    private final EventsMapper em;
    @Override
    public Optional<Events> searchEvent(Long id) {
        return je.findById(id);
    }
}
