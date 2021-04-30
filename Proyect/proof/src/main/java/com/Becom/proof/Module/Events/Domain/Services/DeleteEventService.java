package com.Becom.proof.Module.Events.Domain.Services;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Models.Events;

import java.util.Optional;

public interface DeleteEventService {

    Optional<EventsDTO> deleteEvent(Long id);

}
