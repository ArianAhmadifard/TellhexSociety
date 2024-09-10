package com.TellhexSociety.Api.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class HomeController {

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

}
