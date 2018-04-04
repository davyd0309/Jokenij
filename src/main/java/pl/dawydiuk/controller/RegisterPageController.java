package pl.dawydiuk.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.dawydiuk.domain.User;
import pl.dawydiuk.service.UserService;

import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

@Controller
public class RegisterPageController {


    private UserService userService;

    @Autowired
    public RegisterPageController(UserService userService) {
        this.userService = userService;
    }

    @GET
    @RequestMapping("/register")
    public String showRegisterPage(Model model) {

        User user = new User();
        model.addAttribute("user",user);
        return "register";
    }

    @POST
    @RequestMapping("/addUser")
    public String registerUserAction(@Valid User user, BindingResult result,Model model){

        return "register";

    }


}