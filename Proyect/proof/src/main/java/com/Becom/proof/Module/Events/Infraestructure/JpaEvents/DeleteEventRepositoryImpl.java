package com.Becom.proof.Module.Events.Infraestructure.JpaEvents;

import com.Becom.proof.Module.Assistances.Domain.Repository.AssistanceGetByEventRepository;
import com.Becom.proof.Module.Assistances.Domain.Services.AssistanceGetByEventService;
import com.Becom.proof.Module.Assistances.Infraestructure.JpaRepository.JpaAssistance;
import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Events.Domain.Repository.DeleteEventRepository;
import com.Becom.proof.Module.Events.Domain.Repository.GetAllEventsRepository;
import com.Becom.proof.Module.Events.Domain.Services.GetAllEventsService;
import com.Becom.proof.Module.Events.Infraestructure.EventsMapper.EventsMapper;
import com.Becom.proof.Module.Models.Assistance;
import com.Becom.proof.Module.Models.Events;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@AllArgsConstructor
public class DeleteEventRepositoryImpl implements DeleteEventRepository {
    private final EventsMapper em;
    private final JpaEvents je;
    private final JpaAssistance ja;
    private final AssistanceGetByEventService gae;
    @Override
    public Optional<EventsDTO> deleteEvent(Long id) {

        ja.deleteAll(gae.listAssistance(id));
        je.deleteById(id);

        return Optional.ofNullable(null);
    }
}
