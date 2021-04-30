package com.Becom.proof.Module.Assistances.Domain.Repository;

import com.Becom.proof.Module.Assistances.Domain.DTO.AssistanceDTO;
import com.Becom.proof.Module.Models.Assistance;

public interface AddAssistanceToEventRepository {


    AssistanceDTO addAssistance(AssistanceDTO in);


}
