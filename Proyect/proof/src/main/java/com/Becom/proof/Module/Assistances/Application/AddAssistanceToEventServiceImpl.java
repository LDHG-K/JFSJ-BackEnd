package com.Becom.proof.Module.Assistances.Application;

import com.Becom.proof.Module.Assistances.Domain.DTO.AssistanceDTO;
import com.Becom.proof.Module.Assistances.Domain.Repository.AddAssistanceToEventRepository;
import com.Becom.proof.Module.Assistances.Domain.Services.AddAssistanceToEventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddAssistanceToEventServiceImpl implements AddAssistanceToEventService {

    private final AddAssistanceToEventRepository aaer;

    @Override
    public AssistanceDTO addAssistance(AssistanceDTO in) {
        return aaer.addAssistance(in);
    }
}
