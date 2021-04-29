package com.Becom.proof.Module.Users.Infraestructure.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UserGetController {

    @GetMapping
    public ResponseEntity<HttpStatus> getAll(){


        return new ResponseEntity<>(null);
    }
}
