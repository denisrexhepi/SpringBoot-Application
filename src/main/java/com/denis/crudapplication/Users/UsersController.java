package com.denis.crudapplication.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RequestMapping("/users")
@Controller
public class UsersController {

    @Autowired
    UsersService usersService;

    @RequestMapping("")
    public  String getAllUsers(@ModelAttribute("user") Users user, Model model){
        model.addAttribute("users", usersService.getAllUsers());
        return "index";
    }

    @GetMapping("/{id}")
    public String getSpecificUser(@ModelAttribute("user") Users user,  @PathVariable int id, Model model){
        model.addAttribute("users", usersService.getSpecificUser(id));
        return "single-user";
    }

    @DeleteMapping("{id}")
    public String deleteUser(@ModelAttribute("user") Users user, @PathVariable int id, Model model){
        usersService.deleteUser(id);
        model.addAttribute("users", usersService.getAllUsers());
        return "index";
    }

    @PostMapping("")
    public String  insertUser(@ModelAttribute("user") Users user, Model model){
        usersService.insertUser(user);
        usersService.getAllUsers();
        model.addAttribute("users", usersService.getAllUsers());
        return "index";
    }

    @PutMapping("{id}")
    public String  editUser(@ModelAttribute("user") Users user, Model model){
        usersService.editUser(user);
        usersService.getAllUsers();
        model.addAttribute("users", usersService.getAllUsers());
        return "index";
    }
}
