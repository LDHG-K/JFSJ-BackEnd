package com.Becom.proof.Module.Users.Application;

import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTOResponseIn;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTOResponseOut;
import com.Becom.proof.Module.Users.Domain.Repository.SaveUserRepository;
import com.Becom.proof.Module.Users.Domain.Services.SaveUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SaveUserServiceIBasic implements SaveUserService {

    private final SaveUserRepository sus;


    @Override
    public UserDTOResponseOut saveUser(UserDTOResponseIn in) {

        UserDTO save = UserDTO.builder()
                .userId(in.getId())
                .userName(in.getName())
                .userCreationDate(new Date())
                .userEditDate(new Date())
                .build();
        Optional<User> temp = sus.saveUser(save);
        System.out.println(temp.get().getUserId());
        if (temp.get().getUserName().equals(in.getName())){
            return UserDTOResponseOut.builder()
                    .id(temp.get().getUserId())
                    .name(temp.get().getUserName())
                    .build();
        }

        return null;
    }
}
