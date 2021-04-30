package com.Becom.proof.Module.Assistances.Infraestructure.JpaRepository;

import com.Becom.proof.Module.Models.Assistance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaAssistance extends JpaRepository<Assistance,Long> {

    //List<Asistencia> findByAsistenciaPK_IdEvento(Long id);
    List<Assistance> findByAssistancePk_EventId(Long id);
}
