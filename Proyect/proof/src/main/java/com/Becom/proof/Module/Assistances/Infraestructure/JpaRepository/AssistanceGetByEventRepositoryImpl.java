package com.Becom.proof.Module.Assistances.Infraestructure.JpaRepository;

import com.Becom.proof.Module.Assistances.Domain.Repository.AssistanceGetByEventRepository;
import com.Becom.proof.Module.Models.Assistance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@AllArgsConstructor
@Repository
public class AssistanceGetByEventRepositoryImpl implements AssistanceGetByEventRepository {

    private final JpaAssistance ja;

    @Override
    public List<Assistance> getListEventsByEvents(Long id) {
        return ja.findByAssistancePk_EventId(id);
    }
}
