package com.trenc.rest.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/yilmaz_sonmez")
@Controller
public class ControlPages {

    @GetMapping(value="")
    private String index(){
        return "index";
    }

    @GetMapping(value = "/about_me")
    private String about(){
        return "aboutMe";
    }

    @GetMapping(value = "/files/yilmaz_sonmez_CV")
    private String requestCV(){
        return "yilmaz_sonmez_CV";
    }

}
