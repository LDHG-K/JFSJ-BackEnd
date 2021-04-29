package com.Becom.proof.Module.Events.Infraestructure.Controller;

import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestUpdateOutDTO;
import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestUpdateInDTO;
import com.Becom.proof.Module.Events.Domain.Services.UpdateEventsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/eventos")
@AllArgsConstructor
public class EventsUpdateController {

    private final UpdateEventsService ues;

    @PutMapping("/{id}")
    public ResponseEntity<EventsRequestUpdateOutDTO> updateEvent(@RequestBody EventsRequestUpdateInDTO in, @PathVariable ("id") Long id){
        EventsRequestUpdateOutDTO res = ues.updateEvent(id,in);
        if (res!=null){
            return new ResponseEntity(res, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NO_CONTENT) ;
    }




}
