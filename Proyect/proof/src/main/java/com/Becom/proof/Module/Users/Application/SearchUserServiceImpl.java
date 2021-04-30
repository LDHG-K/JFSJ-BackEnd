package com.Becom.proof.Module.Users.Application;

import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.Repository.SearchUserRepository;
import com.Becom.proof.Module.Users.Domain.Services.SearchUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class SearchUserServiceImpl implements SearchUserService {

    private final SearchUserRepository suts;

    @Override
    public Optional<User> searchUser(Long id) {
        return suts.searchUser(id);
    }
}
