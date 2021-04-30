package com.Becom.proof.Module.Events.Domain.Services;

import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestAllotInDTO;
import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestUpdateOutDTO;

public interface AllotEventsToUserService {

    EventsRequestUpdateOutDTO allotEvents(EventsRequestAllotInDTO in, Long id);

}
