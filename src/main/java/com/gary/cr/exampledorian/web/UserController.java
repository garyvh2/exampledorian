package com.gary.cr.exampledorian.web;

import com.gary.cr.exampledorian.domain.User;
import com.gary.cr.exampledorian.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    private UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUser() {
        return this.userService.getAllUsers();
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return this.userService.insert(user);
    }

    @PutMapping
    public User update(@RequestBody User user) {
         return this.userService.update(user);
    }
}
