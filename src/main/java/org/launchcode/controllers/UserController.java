package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("add")
    public String displayAddUserForm(String username, String email, String password, String verify) {
        User user = new User(username, email, password, verify);
    }

//    @PostMapping("/signup")
//    public String processSignup(@RequestParam String fName, String lName, String email){
//        User user = new User(fName, lName, email);
//        users.add(user);
//        return "redirect";
//    }
}

