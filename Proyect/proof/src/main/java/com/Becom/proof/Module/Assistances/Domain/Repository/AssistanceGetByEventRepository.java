package com.Becom.proof.Module.Assistances.Domain.Repository;

import com.Becom.proof.Module.Models.Assistance;

import java.util.List;

public interface AssistanceGetByEventRepository {

    List<Assistance> getListEventsByEvents(Long id);

}
