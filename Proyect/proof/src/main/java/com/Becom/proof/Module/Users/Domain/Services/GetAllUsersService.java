package com.Becom.proof.Module.Users.Domain.Services;

import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;

import java.util.List;

public interface GetAllUsersService {
    List<UserDTO> getUsers();
}
