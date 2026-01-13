package com.learn.securitytest.backend.controller;

import com.learn.securitytest.backend.dto.CreateUserRequest;
import com.learn.securitytest.backend.entity.User;
import com.learn.securitytest.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final
 UserService service;

    @GetMapping
    public List<User> list() {
        return service.findAll();
    }

    @PostMapping
    public User create(@RequestBody CreateUserRequest request) {
        return service.create(request);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
