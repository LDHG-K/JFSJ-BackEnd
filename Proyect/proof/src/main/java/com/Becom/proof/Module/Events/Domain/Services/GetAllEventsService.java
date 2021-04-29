package com.Becom.proof.Module.Events.Domain.Services;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;

import java.util.List;

public interface GetAllEventsService {

    List<EventsDTO> getEvents();

}
