package fr.alProject.adapter.controller;
import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.port.in.SkillserviceFindAll;
import fr.alProject.port.in.UserSaveService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserSaveService userSaveService ;



    public UserController(UserSaveService userSaveService) {
        this.userSaveService = userSaveService;
    }

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
        int statusUserChecked = 0;
        switch (statusUser) {
            case 1 -> {
                statusUserChecked = 1;
            }
            case 2 -> {
                statusUserChecked = 2;
            }
            default -> errorBody.put("errorRarity", "the chosen status is unknown");
        }

        if (!errorBody.isEmpty())
            return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);

        try{
            UserEntity userCreated = this.userSaveService.save(firstName,lastName, statusUserChecked);
            return new ResponseEntity<>(userCreated, HttpStatus.CREATED);
        }catch (IllegalArgumentException e){
            errorBody.put("internalError", e.getMessage());
            return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
        }

    }

}
