package com.Becom.proof.Module.Events.Domain.DTO;

import lombok.Builder;

import java.util.Date;
@Builder
public class EventsRequestUpdateOutDTO {

    private long id;
    private Date fecha;
    private String nombre;
    private String descripcion;

}
