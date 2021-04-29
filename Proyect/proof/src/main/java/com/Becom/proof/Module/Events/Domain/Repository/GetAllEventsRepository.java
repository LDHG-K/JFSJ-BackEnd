package com.Becom.proof.Module.Events.Domain.Repository;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;

import java.util.List;

public interface GetAllEventsRepository {
    List<EventsDTO> getAllEvents();
}
