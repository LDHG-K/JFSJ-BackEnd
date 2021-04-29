package com.Becom.proof.Module.Events.Application;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Events.Domain.Services.SearchEventsService;
import com.Becom.proof.Module.Events.Domain.Repository.SearchEventsRepository;
import com.Becom.proof.Module.Models.Events;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class SearchEventsServiceImpl implements SearchEventsService {
    private SearchEventsRepository ser;
    @Override
    public Optional<Events> searchEvent(Long id) {
        return ser.searchEvent(id);
    }
}
