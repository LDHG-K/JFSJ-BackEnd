package com.Becom.proof.Module.Assistances.Infraestructure.AssistancesMapper;

import com.Becom.proof.Module.Assistances.Domain.DTO.AssistanceDTO;
import com.Becom.proof.Module.Models.Assistance;
import com.Becom.proof.Module.Models.AssistancePk;
import org.mapstruct.Mapper;

@Mapper
public abstract  class AssistanceMapper {

    public AssistanceDTO assistantToAssistanceDTO(Assistance in){
        return AssistanceDTO.builder()
                .idUsuario(in.getAssistancePk().getUserId())
                .idEvento(in.getAssistancePk().getEventId())
                .build();
    }

    public Assistance assistanceDTOToAssistance(AssistanceDTO in){
        return Assistance.builder()
                .assistancePk(AssistancePk.builder()
                        .eventId(in.getIdEvento())
                        .userId(in.getIdUsuario())
                        .build())
                .build();
    }

}
