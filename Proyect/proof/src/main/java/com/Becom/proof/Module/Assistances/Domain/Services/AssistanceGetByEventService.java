package com.Becom.proof.Module.Assistances.Domain.Services;

import com.Becom.proof.Module.Models.Assistance;

import java.util.List;

public interface AssistanceGetByEventService {

    List<Assistance> listAssistance(Long id);

}
