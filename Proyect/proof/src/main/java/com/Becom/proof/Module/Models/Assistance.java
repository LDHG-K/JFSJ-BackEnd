package com.Becom.proof.Module.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "assistances")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Assistance {

        @EmbeddedId
        private AssistancePk aPK;

        @ManyToOne(optional = false )
        @JoinColumn(name = "user_id",referencedColumnName = "user_id", nullable = false,insertable = false,updatable = false)
        private User usuario;

        @ManyToOne(optional = false)
        @JoinColumn(name = "event_id" ,referencedColumnName = "event_id",nullable = false, updatable = false,insertable = false)
        private Events evento;



}
