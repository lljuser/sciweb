package com.cnabs.sciweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(value = "/index")
    public String index(){
        return "this sci test home index";
    }
}
