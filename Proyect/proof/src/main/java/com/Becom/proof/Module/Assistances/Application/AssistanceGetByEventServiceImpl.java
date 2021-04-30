package com.Becom.proof.Module.Assistances.Application;

import com.Becom.proof.Module.Assistances.Domain.Repository.AssistanceGetByEventRepository;
import com.Becom.proof.Module.Assistances.Domain.Services.AssistanceGetByEventService;
import com.Becom.proof.Module.Models.Assistance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class AssistanceGetByEventServiceImpl implements AssistanceGetByEventService {

    private final AssistanceGetByEventRepository agbe;

    @Override
    public List<Assistance> listAssistance(Long id) {
        return agbe.getListEventsByEvents(id);
    }
}
