package com.Becom.proof.Module.Events.Domain.DTO;

import com.Becom.proof.Module.Models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


import java.util.Date;
@Builder
@AllArgsConstructor
@Getter
public class EventsDTO {

    private Long eventId;
    private Date eventCreationDate;
    private Date eventDate;
    private Date eventDescription;
    private Date eventEditDate;
    private String eventName;

    //Fk
    private User user;
}
