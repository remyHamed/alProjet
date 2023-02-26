package fr.alProject.adapter.controller;

import fr.alProject.adapter.Entity.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/skill")
public class SkillController {

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Map<String, Object> body){

        Map<String, String> errorBody = new HashMap<>();

        if (!body.containsKey("userId"))
            errorBody.put("errorName", "userId is missing !");

        Integer userId = (Integer) body.get("userId");
        if (userId == null)
            errorBody.put("errorName", "userId is null !");

        if (!body.containsKey("price"))
            errorBody.put("errorName", "price is missing !");

        Integer price = (Integer) body.get("price");
        if (userId == null)
            errorBody.put("errorName", "price is null !");


        String title = (String) body.get("title");
        if (title == null)
            errorBody.put("errorName", "lastName is null !");


        if (!errorBody.isEmpty())
            return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);

        try{

        }catch (IllegalArgumentException e){
            errorBody.put("internalError", e.getMessage());
            return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
        }

    }
}
