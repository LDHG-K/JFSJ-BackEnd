package com.Becom.proof.Module.Events.Application;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Events.Domain.Repository.DeleteEventRepository;
import com.Becom.proof.Module.Events.Domain.Services.DeleteEventService;
import com.Becom.proof.Module.Models.Events;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class DeleteEventServiceImpl implements DeleteEventService {

    private final DeleteEventRepository der;

    @Override
    public Optional<EventsDTO> deleteEvent(Long id) {

        der.deleteEvent(id);

        return Optional.empty();
    }
}
