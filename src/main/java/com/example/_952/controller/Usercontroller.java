package com.example._952.controller;

import com.example._952.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Usercontroller {
    @PostMapping("/users")
    public void printData(@RequestBody User user) {
        System.out.println("Printing the user data:"+user);
    }
//@GetMapping("/home")
//    public String test(){
//        return "Test";

//}
}

