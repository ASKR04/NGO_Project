package org.example.ngo_project.Controller;

import org.example.ngo_project.Services.UserService;
import org.example.ngo_project.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

@RestController
@CrossOrigin("http://localhost:3000")
/*@RequestMapping("/api/users")*/
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/loginuser")
    @CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
    public ResponseEntity<AtomicBoolean> getUser(@RequestBody User user) {
        List<User> userList = userService.getAllUsers();
        AtomicBoolean flag = new AtomicBoolean(false);
        userList.forEach((user1 -> {
            if (user1.getEmail().equalsIgnoreCase(user.getEmail()) && user1.getPassword().equalsIgnoreCase(user.getPassword())) {
                flag.set(true);
            }
        }));
        return new ResponseEntity<>(flag, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}


