package com.Becom.proof.Module.Users.Infraestructure.JpaRepository;

import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.Repository.SearchUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
@AllArgsConstructor
public class SearchUserRepositoryImpl implements SearchUserRepository {
    private final JpaUser ju;
    @Override
    public Optional<User> searchUser(Long id) {
        return ju.findById(id);
    }
}
