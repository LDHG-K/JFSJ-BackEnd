package com.Becom.proof.Module.Events.Infraestructure.Controller;

import com.Becom.proof.Module.Events.Domain.DTO.EventsDTO;
import com.Becom.proof.Module.Events.Domain.Services.GetAllEventsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/eventos")
public class EventsGetAllController {

    private final GetAllEventsService gae;

    @GetMapping
    public ResponseEntity<HttpStatus> getAllEvents(){

        List<EventsDTO> temp = gae.getEvents();
        if (temp.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(temp, HttpStatus.ACCEPTED);
    }


}
