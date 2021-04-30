package com.Becom.proof.Module.Events.Infraestructure.Controller;


import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestAllotInDTO;
import com.Becom.proof.Module.Events.Domain.DTO.EventsRequestUpdateOutDTO;
import com.Becom.proof.Module.Events.Domain.Services.AllotEventsToUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class EventsAllotController {

    private final AllotEventsToUserService aetu;

    @PostMapping("/usuarios/{id}/eventos")
    public ResponseEntity<HttpStatus> allotEventToUser(@RequestBody EventsRequestAllotInDTO in, @PathVariable ("id") Long id){
        EventsRequestUpdateOutDTO res = aetu.allotEvents(in,id);
        if (res==null){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(res, HttpStatus.ACCEPTED);
    }
}
