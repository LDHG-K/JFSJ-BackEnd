package com.Becom.proof.Module.Users.Domain.Repository;

import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;

import java.util.Optional;

public interface SaveUserRepository {

    Optional<User> saveUser(UserDTO save);

}
