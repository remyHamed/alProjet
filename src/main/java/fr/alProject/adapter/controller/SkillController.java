package fr.alProject.adapter.controller;

import fr.alProject.adapter.Entity.SkillEntity;
import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.port.in.SkillSaveService;
import fr.alProject.port.in.SkillserviceFindAll;
import fr.alProject.port.out.SkillSaveRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/skill")
public class SkillController {

    SkillSaveService skillSaveService;
    SkillserviceFindAll skillserviceFindAll;



    SkillController(
            SkillSaveService skillSaveService,
            SkillserviceFindAll skillserviceFindAll) {
        this.skillSaveService = skillSaveService;
        this.skillserviceFindAll = skillserviceFindAll;
    }

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

            SkillEntity skillCreated = this.skillSaveService.save(userId,title,price);

            return new ResponseEntity<>(skillCreated, HttpStatus.CREATED);

        }catch (IllegalArgumentException e){
            errorBody.put("internalError", e.getMessage());
            return new ResponseEntity<>(errorBody, HttpStatus.BAD_REQUEST);
        }

    }
    @GetMapping
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(this.skillserviceFindAll.findAll());
    }
}
