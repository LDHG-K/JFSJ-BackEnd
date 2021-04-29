package com.Becom.proof.Module.Users.Domain.Services;

import com.Becom.proof.Module.Users.Domain.DTO.UserDTOResponseIn;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTOResponseOut;

public interface SaveUserService {

    UserDTOResponseOut saveUser(UserDTOResponseIn in);

}
