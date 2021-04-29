package com.Becom.proof.Module.Events.Infraestructure.JpaEvents;

import com.Becom.proof.Module.Models.Events;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaEvents extends JpaRepository<Events,Long> {
}
