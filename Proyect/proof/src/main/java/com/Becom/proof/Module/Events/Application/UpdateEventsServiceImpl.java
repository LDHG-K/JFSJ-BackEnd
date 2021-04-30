package com.Becom.proof.Module.Events.Application;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestUpdateOutDTO;
import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestUpdateInDTO;
import com.Becom.proof.Module.Events.Domain.Repository.UpdateEventsRepository;
import com.Becom.proof.Module.Events.Domain.Services.SearchEventsService;
import com.Becom.proof.Module.Events.Domain.Services.UpdateEventsService;
import com.Becom.proof.Module.Models.Events;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@AllArgsConstructor
@Service
public class UpdateEventsServiceImpl implements UpdateEventsService {

    private final UpdateEventsRepository uer;
    private final SearchEventsService ses;
    @Override
    public EventsRequestUpdateOutDTO updateEvent(long id , EventsRequestUpdateInDTO in) {

        Events mirror = ses.searchEvent(id).get();

        if (mirror==null){
            return null;
        }

        EventsRequestUpdateInDTO changes = in;

        if (in.getNombre()!=null){
            mirror.setEventName(in.getNombre());
        }
        if (in.getFecha()!=null){
            mirror.setEventDate(in.getFecha());
        }
        if (in.getDescripcion()!=null) {
            mirror.setEventDescription(in.getDescripcion());
        }
        mirror.setEventEditDate(new Date());

        uer.updateEvents(mirror);

        EventsRequestUpdateOutDTO res = EventsRequestUpdateOutDTO.builder()
                .id(mirror.getUserId())
                .descripcion(mirror.getEventDescription())
                .fecha(mirror.getEventDate())
                .nombre(mirror.getEventName())
                .build();

        return res;
    }
}
