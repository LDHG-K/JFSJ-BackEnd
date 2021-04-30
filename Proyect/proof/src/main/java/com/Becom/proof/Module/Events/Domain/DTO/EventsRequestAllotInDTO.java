package com.Becom.proof.Module.Events.Domain.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
public class EventsRequestAllotInDTO {

    private String nombre;
    private Date fecha;
    private String descripcion;

}

