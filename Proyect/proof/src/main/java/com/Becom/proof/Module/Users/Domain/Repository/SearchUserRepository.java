package com.Becom.proof.Module.Users.Domain.Repository;

import com.Becom.proof.Module.Models.User;

import java.util.Optional;

public interface SearchUserRepository {

    Optional<User> searchUser(Long id);
}
