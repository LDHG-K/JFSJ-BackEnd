package com.Becom.proof.Module.Users.Application;

import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;
import com.Becom.proof.Module.Users.Domain.Services.GetAllUsersService;
import com.Becom.proof.Module.Users.Domain.Repository.GetAllUsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class GetAllUsersServiceImpl implements GetAllUsersService {

    private final GetAllUsersRepository gaur;

    @Override
    public List<UserDTO> getUsers() {
        return gaur.getAllUsers();
    }
}
