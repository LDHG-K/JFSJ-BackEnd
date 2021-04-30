package com.Becom.proof.Module.Events.Infraestructure.JpaEvents;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Events.Domain.Repository.GetAllEventsRepository;
import com.Becom.proof.Module.Models.Events;
import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
@AllArgsConstructor
public class GetAllEventsRepositoryImpl implements GetAllEventsRepository {
    private final JpaEvents je;

    @Override
    public List<EventsDTO> getAllEvents() {

        List<Events> listFromDB = je.findAll();
        List<EventsDTO> list = listFromDB.stream().map(listDTO -> EventsDTO.builder()
                .eventId(listDTO.getEventId())
                .eventName(listDTO.getEventName())
                .eventDate(listDTO.getEventDate())
                .eventDescription(listDTO.getEventDescription())
                .eventCreationDate(listDTO.getEventCreationDate())
                .eventEditDate(listDTO.getEventEditDate())
                .userId(listDTO.getUserId())
                .build())
                .collect(Collectors.toList());

        return list;
    }
}
