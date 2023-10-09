package org.launchcode.controllers;

import org.springframework.ui.Model;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("")
    public String displayAddUserForm() {
        return "user/add";
    }

    @PostMapping("")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
       if (!user.getPassword().equals(verify)){
            return "user/add";
        }
       model.addAttribute("username", user.getUsername());
       return "user/index";
    }
}
