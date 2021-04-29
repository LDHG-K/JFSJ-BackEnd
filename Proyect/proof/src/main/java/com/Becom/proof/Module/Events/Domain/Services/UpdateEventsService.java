package com.Becom.proof.Module.Events.Domain.Services;

import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestUpdateOutDTO;
import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestUpdateInDTO;

public interface UpdateEventsService {

    EventsRequestUpdateOutDTO updateEvent(long id, EventsRequestUpdateInDTO in);

}
