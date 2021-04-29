package com.Becom.proof.Module.Users.Infraestructure.UserMapper;

import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;
import org.mapstruct.Mapper;

@Mapper
public abstract class UserMapper {

    public User userDTOToUser(UserDTO userDTO){
        return User.builder()
                .userId(userDTO.getUserId())
                .userName(userDTO.getUserName())
                .userCrationDate(userDTO.getUserCreationDate())
                .userEditDate(userDTO.getUserEditDate())
                .build();
    }

    public UserDTO userToUserDTO(User user){
        return UserDTO.builder()
                .userId(user.getUserId())
                .userCreationDate(user.getUserCrationDate())
                .userEditDate(user.getUserEditDate())
                .userName(user.getUserName())
                .build();
    }




}
