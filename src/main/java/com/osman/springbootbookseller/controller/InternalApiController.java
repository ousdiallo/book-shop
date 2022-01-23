package com.osman.springbootbookseller.controller;

import com.osman.springbootbookseller.model.User;
import com.osman.springbootbookseller.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/internal")
public class InternalApiController {
    @Autowired
    private IUserService userService;

    @RequestMapping("make-admin/{username}")
    public ResponseEntity<?> makeEntity(@PathVariable String username)
    {
        userService.makeAdmin(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
