package com.Becom.proof.Module.Events.Infraestructure.Controller;

import com.Becom.proof.Module.Events.Domain.Services.DeleteEventService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/eventos")
@AllArgsConstructor
public class EventsDeleteController {

    private final DeleteEventService des;

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpResponse> deleteEvent(@PathVariable ("id") Long id){

        if (des.deleteEvent(id).isEmpty()){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return  new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
