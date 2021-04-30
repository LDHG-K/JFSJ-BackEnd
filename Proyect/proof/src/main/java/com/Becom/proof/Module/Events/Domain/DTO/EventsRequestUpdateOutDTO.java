package com.Becom.proof.Module.Events.Domain.DTO;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;
@Builder
@Getter
public class EventsRequestUpdateOutDTO {

    private long id;
    private Date fecha;
    private String nombre;
    private String descripcion;

}
