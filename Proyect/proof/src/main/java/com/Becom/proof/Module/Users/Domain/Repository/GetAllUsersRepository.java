package com.Becom.proof.Module.Users.Domain.Repository;

import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;

import java.util.List;

public interface GetAllUsersRepository {
    List<UserDTO> getAllUsers();
}
