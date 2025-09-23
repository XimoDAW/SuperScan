package com.superscann.SuperScann.controller;

import com.superscann.SuperScann.controller.model.UserWeb;
import com.superscann.SuperScann.domain.model.User;
import com.superscann.SuperScann.domain.service.UserService;
import com.superscann.SuperScann.http_response.Response;
import com.superscann.SuperScann.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/users/{id}")
    public Response getUserById(@PathVariable int id) {
        UserWeb userWeb = userMapper.toUserWeb(userService.findById(id));
        return new Response(userWeb);

        /*
        if (userWeb != null) {
            return ResponseEntity.ok(userWeb);
        } else {
            return ResponseEntity.notFound().build();
        }*/
    }
}
