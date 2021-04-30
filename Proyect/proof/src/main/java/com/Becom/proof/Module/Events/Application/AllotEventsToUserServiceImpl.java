package com.Becom.proof.Module.Events.Application;

import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestAllotInDTO;
import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestUpdateOutDTO;
import com.Becom.proof.Module.Events.Domain.Services.AllotEventsToUserService;
import com.Becom.proof.Module.Events.Domain.Repository.AllotEventsToUserRepository;
import com.Becom.proof.Module.Models.Events;
import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.Services.SearchUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AllotEventsToUserServiceImpl implements AllotEventsToUserService {

    private final AllotEventsToUserRepository aetr;
    private final SearchUserService sus;

    @Override
    public EventsRequestUpdateOutDTO allotEvents(EventsRequestAllotInDTO in, Long id) {

        Optional<User> aut = sus.searchUser(id);

        if (aut.isEmpty()){
            return null;
        }

        Events save = Events.builder()
                .userId(id)
                .eventName(in.getNombre())
                .eventDate(in.getFecha())
                .eventDescription(in.getDescripcion())
                .eventCreationDate(new Date())
                .eventEditDate(new Date())
                .build();

        Optional<Events> saved =  aetr.saveAllotEventsToUser(save);

        EventsRequestUpdateOutDTO res = EventsRequestUpdateOutDTO.builder()
                .id(saved.get().getEventId())
                .nombre(saved.get().getEventName())
                .fecha(saved.get().getEventDate())
                .descripcion(saved.get().getEventDescription())
                .build();

        return res;
    }
}
