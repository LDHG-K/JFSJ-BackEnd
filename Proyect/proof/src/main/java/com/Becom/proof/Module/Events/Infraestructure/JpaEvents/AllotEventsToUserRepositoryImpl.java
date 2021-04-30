package com.Becom.proof.Module.Events.Infraestructure.JpaEvents;

import com.Becom.proof.Module.Events.Domain.Repository.AllotEventsToUserRepository;
import com.Becom.proof.Module.Models.Events;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@AllArgsConstructor
public class AllotEventsToUserRepositoryImpl implements AllotEventsToUserRepository {

    private final JpaEvents je;

    @Override
    public Optional<Events> saveAllotEventsToUser(Events event) {
        return Optional.ofNullable(je.save(event));
    }
}
