package fr.alProject.adapter.controller;

import fr.alProject.domain.enumerator.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Map<String, Object> body){

        Map<String, String> errorBody = new HashMap<>();

        String firstName = (String) body.get("firstName");
        if (firstName == null)
            errorBody.put("errorName", "firstName is null !");

        String lastName = (String) body.get("lastName");
        if (lastName == null)
            errorBody.put("errorName", "lastName is null !");


        if (body.get("status") == null)
            errorBody.put("errorName", "status is null !");

        int statusUser = (int) body.get("status");

        switch (statusUser) {
            case 1 -> statusUser = 1;
            case 2 -> statusUser = 2;
            default -> errorBody.put("errorRarity", "the chosen status is unknown");
        }

        if (!errorBody.isEmpty())
            return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);

        try{
            System.out.println("todo");
        }catch (IllegalArgumentException e){
            errorBody.put("internalError", e.getMessage());
            return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
        }

    }

}
