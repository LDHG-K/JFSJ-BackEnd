package com.Becom.proof.Module.Events.Domain.Repository;

import com.Becom.proof.Module.Models.Events;

import java.util.Optional;

public interface AllotEventsToUserRepository {

    Optional<Events> saveAllotEventsToUser(Events event);

}
