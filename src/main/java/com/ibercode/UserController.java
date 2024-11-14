package com.ibercode;

import com.ibercode.User;
import com.ibercode.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {

        List<User> users = userRepository.findAll();
        System.out.println("Retrieved users: " + users); // Debugging line
        return users;
    }
}
