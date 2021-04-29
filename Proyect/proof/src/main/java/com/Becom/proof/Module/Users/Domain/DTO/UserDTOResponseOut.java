package com.Becom.proof.Module.Users.Domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class UserDTOResponseOut {

    private long id ;
    private String name;

}
