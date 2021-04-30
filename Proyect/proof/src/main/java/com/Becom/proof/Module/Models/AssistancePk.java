package com.Becom.proof.Module.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AssistancePk implements Serializable {

        @Basic(optional = false)
        @Column(name = "user_id", nullable = false,updatable = false,insertable = false)
        private Long userId;

        @Basic(optional = false)
        @Column(name = "event_id", nullable = false,insertable = false,updatable = false)
        private Long eventId;
}
