package com.Becom.proof.Module.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Builder
@AllArgsConstructor
@Data
@Entity
@Table(name="events")
public class Events {

    @Id
    @Column(name="event_id")
    private Long eventId;

    @Temporal(TemporalType.DATE)
    @Column(name="event_creation_date")
    private Date eventCreationDate;

    @Temporal(TemporalType.DATE)
    @Column(name="event_date")
    private Date eventDate;

    @Temporal(TemporalType.DATE)
    @Column(name="event_description")
    private Date eventDescription;

    @Temporal(TemporalType.DATE)
    @Column(name="event_edit_date")
    private Date eventEditDate;

    @Column(name="event_name")
    private String eventName;

    //Fk

    @ManyToOne
    @JoinColumn(name="id_creator")
    private User user;



}
