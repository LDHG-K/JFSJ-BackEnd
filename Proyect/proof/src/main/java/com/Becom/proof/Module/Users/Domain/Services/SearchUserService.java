package com.Becom.proof.Module.Users.Domain.Services;

import com.Becom.proof.Module.Models.User;

import java.util.Optional;

public interface SearchUserService {

    Optional<User> searchUser(Long id);

}
