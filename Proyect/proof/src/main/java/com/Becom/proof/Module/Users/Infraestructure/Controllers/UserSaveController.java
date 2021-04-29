package com.Becom.proof.Module.Users.Infraestructure.Controllers;


import com.Becom.proof.Module.Models.User;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTO;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTOResponseIn;
import com.Becom.proof.Module.Users.Domain.DTO.UserDTOResponseOut;
import com.Becom.proof.Module.Users.Domain.Services.SaveUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UserSaveController {

    private final SaveUserService sus;

    @PostMapping
    public ResponseEntity<HttpStatus> saveUser(@RequestBody UserDTOResponseIn in){

        UserDTOResponseOut out = sus.saveUser(in);
        if (out!=null){
            return new ResponseEntity(out,HttpStatus.CREATED);
        }
            return new ResponseEntity( HttpStatus.BAD_REQUEST);
        }


}
