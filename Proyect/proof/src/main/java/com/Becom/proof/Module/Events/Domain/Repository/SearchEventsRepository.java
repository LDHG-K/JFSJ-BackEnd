package com.Becom.proof.Module.Events.Domain.Repository;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Models.Events;

import java.util.Optional;

public interface SearchEventsRepository {
    Optional<Events> searchEvent(Long id);
}
