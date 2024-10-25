package org.technova.controller;


import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.technova.model.User;
import org.technova.service.interfaces.UserService;

import java.util.List;
import java.util.Optional;

@Controller
@Setter
public class UserController {
    private UserService userService;

    @GetMapping("/users")
    public String index(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "/user/index";
    }

    @GetMapping("/users/create")
    public String create(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "/user/create";
    }

    @PostMapping("/users/save")
    public String save(@ModelAttribute("user") User user){
        userService.create(user);
        return "redirect:/users";
    }

    @GetMapping("/users/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model){
        Optional<User> user = userService.findById(id);
        if (user.isPresent()){
            model.addAttribute("user",user.get());
            return "/users/edit";
        }else{
            return "redirect:errors/404";
        }
    }

    @PostMapping("/users/update/{id}")
    public String update(@PathVariable("id") Long id,@ModelAttribute("user") User user){
        userService.update(user);
        return "redirect:/users";
    }

    @GetMapping("/users/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        userService.delete(id);
        return "redirect:/users";
    }

}
