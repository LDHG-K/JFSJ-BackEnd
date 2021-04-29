package com.Becom.proof.Module.Events.Application;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Events.Domain.Repository.GetAllEventsRepository;
import com.Becom.proof.Module.Events.Domain.Services.GetAllEventsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class GetAllEventsServiceImpl implements GetAllEventsService {

    private final GetAllEventsRepository gae;
    @Override
    public List<EventsDTO> getEvents() {return gae.getAllEvents();}
}
