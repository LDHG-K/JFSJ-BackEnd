package com.Becom.proof.Module.Users.Infraestructure.JpaRepository;

import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;
import com.Becom.proof.Module.Users.Domain.Repository.GetAllUsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Repository
public class GetAllUsersRepositoryImpl implements GetAllUsersRepository {

    private final JpaUser jp;

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> listFromDB = jp.findAll();
        List<UserDTO> list = listFromDB.stream().map(listDTO -> UserDTO.builder()
                .userId(listDTO.getUserId())
                .userName(listDTO.getUserName())
                .userCreationDate(listDTO.getUserCrationDate())
                .userEditDate(listDTO.getUserEditDate())
                .build())
                .collect(Collectors.toList());

        return list;
    }
}
