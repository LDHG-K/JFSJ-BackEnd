package com.Becom.proof.Module.Events.Domain.Repository;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;

import java.util.Optional;

public interface DeleteEventRepository {
    Optional<EventsDTO> deleteEvent(Long id);
}
