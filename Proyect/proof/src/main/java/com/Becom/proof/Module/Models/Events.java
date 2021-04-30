package com.Becom.proof.Module.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="events")
public class Events {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="event_id")
    private Long eventId;

    @Temporal(TemporalType.DATE)
    @Column(name="event_creation_date")
    private Date eventCreationDate;

    @Temporal(TemporalType.DATE)
    @Column(name="event_date")
    private Date eventDate;


    @Column(name="event_description")
    private String eventDescription;

    @Temporal(TemporalType.DATE)
    @Column(name="event_edit_date")
    private Date eventEditDate;

    @Column(name="event_name")
    private String eventName;

    //Fk

    @Column(name="id_creator")
    private Long userId;


    @ManyToOne
    @JoinColumn(name="id_creator", updatable = false,insertable = false)
    private User user;



}
