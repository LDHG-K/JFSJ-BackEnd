package com.Becom.proof.Module.Events.Infraestructure.EventsMapper;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Models.Events;
import org.mapstruct.Mapper;

@Mapper
public abstract class EventsMapper {

public EventsDTO eventsToEventDTO(Events events){
    return EventsDTO.builder()
            .eventId(events.getEventId())
            .eventName(events.getEventName())
            .eventEditDate(events.getEventEditDate())
            .eventCreationDate(events.getEventCreationDate())
            .eventDescription(events.getEventDescription())
            .eventDate(events.getEventDate())
            .userId(events.getUserId())
            .build();
}
public Events eventsDTOToEvents(EventsDTO events){
    return Events.builder()
            .eventCreationDate(events.getEventCreationDate())
            .eventDate(events.getEventDate())
            .eventDescription(events.getEventDescription())
            .eventEditDate(events.getEventEditDate())
            .eventId(events.getEventId())
            .eventName(events.getEventName())
            .userId(events.getUserId())
            .build();
}



}
