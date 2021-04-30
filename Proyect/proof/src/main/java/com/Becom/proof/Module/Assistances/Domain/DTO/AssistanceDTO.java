package com.Becom.proof.Module.Assistances.Domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class AssistanceDTO {

    private Long idEvento;
    private Long idUsuario;

}
