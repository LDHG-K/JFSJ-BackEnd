package com.Becom.proof.Module.Users.Infraestructure.Controllers;

import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;
import com.Becom.proof.Module.Users.Domain.Services.GetAllUsersService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UserGetController {
    private final GetAllUsersService gau;
    @GetMapping
    public ResponseEntity<HttpStatus> getAll(){

        List<UserDTO> temp = gau.getUsers();
        if (temp.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(temp, HttpStatus.ACCEPTED);
    }
}
