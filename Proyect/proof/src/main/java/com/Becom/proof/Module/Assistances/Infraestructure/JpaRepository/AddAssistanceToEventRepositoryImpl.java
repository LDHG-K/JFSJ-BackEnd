package com.Becom.proof.Module.Assistances.Infraestructure.JpaRepository;

import com.Becom.proof.Module.Assistances.Domain.DTO.AssistanceDTO;
import com.Becom.proof.Module.Assistances.Domain.Repository.AddAssistanceToEventRepository;
import com.Becom.proof.Module.Assistances.Infraestructure.AssistancesMapper.AssistanceMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class AddAssistanceToEventRepositoryImpl implements AddAssistanceToEventRepository {

    private final JpaAssistance ja;
    private final AssistanceMapper am;

    @Override
    public AssistanceDTO addAssistance(AssistanceDTO in) {
        return  am.assistantToAssistanceDTO(ja.save(am.assistanceDTOToAssistance(in)));
    }
}
