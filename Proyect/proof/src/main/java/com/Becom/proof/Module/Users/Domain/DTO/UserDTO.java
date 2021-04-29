package com.Becom.proof.Module.Users.Domain.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;
@Builder
@Getter
@AllArgsConstructor
public class UserDTO {

    private Long userId;
    private String userName;
    private Date userCreationDate;
    private Date userEditDate;

}
