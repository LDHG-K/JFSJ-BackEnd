package com.Becom.proof.Module.Assistances.Infraestructure.Controller;

import com.Becom.proof.Module.Assistances.Domain.DTO.AssistanceDTO;
import com.Becom.proof.Module.Assistances.Domain.Services.AddAssistanceToEventService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asistencia")
@AllArgsConstructor
public class AssistanceAddController{

    private final AddAssistanceToEventService aae;
    @PostMapping
    public ResponseEntity<HttpStatus> addAssistanceToEvent (@RequestBody AssistanceDTO in){

        AssistanceDTO res = aae.addAssistance(in);

        if (res.getIdEvento()==null||res.getIdUsuario()==null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(res,HttpStatus.CREATED);
    }

}
