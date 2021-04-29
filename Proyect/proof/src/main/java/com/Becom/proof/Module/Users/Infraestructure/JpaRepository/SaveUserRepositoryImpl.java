package com.Becom.proof.Module.Users.Infraestructure.JpaRepository;

import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;
import com.Becom.proof.Module.Users.Domain.Repository.SaveUserRepository;
import com.Becom.proof.Module.Users.Infraestructure.UserMapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@AllArgsConstructor
@Repository
public class SaveUserRepositoryImpl implements SaveUserRepository {

    private final JpaUser sur;
    private final UserMapper ump;

    @Override
    public Optional<User> saveUser(UserDTO save) {

        Optional<User> saved = Optional.ofNullable(sur.save(ump.userDTOToUser(save)));

        if (saved.isEmpty()){
            return null;
        }
        return saved;
    }
}
