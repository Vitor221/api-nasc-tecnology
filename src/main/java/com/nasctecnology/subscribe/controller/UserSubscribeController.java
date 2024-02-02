package com.nasctecnology.subscribe.controller;

import com.nasctecnology.subscribe.domain.UserSubscribe;
import com.nasctecnology.subscribe.services.UserSubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usersubscribe")
@CrossOrigin(origins = "http://localhost:4200")
public class UserSubscribeController {

    @Autowired
    private UserSubscribeService service;

    @PostMapping
    public ResponseEntity<UserSubscribe> create(@RequestBody UserSubscribe userSubscribe) {
         UserSubscribe _userSubscribe = service.create(userSubscribe);
         return ResponseEntity.ok().body(_userSubscribe);
    }

    @GetMapping
    public ResponseEntity<List<UserSubscribe>> findAll() {
        List<UserSubscribe> userSubscribeList = service.findAll();
        return ResponseEntity.ok().body(userSubscribeList);
    }

}
