package com.TellhexSociety.Api.Controller;

import com.TellhexSociety.Api.Entity.User;
import com.TellhexSociety.Api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "")
public class HomeController {

    @Autowired
    private UserService _service;


    @GetMapping(value = "")
    public String Root()
    {
        return "home";
    }

    @GetMapping(value = "/api/messenger")
    public String MessengerRoot()
    {
        return "messenger home api";
    }

    @GetMapping(value = "/test")
    public User test(Long id)
    {
        if(id == null)
            return null;
        else
            return _service.GetUser(id);
    }

}
