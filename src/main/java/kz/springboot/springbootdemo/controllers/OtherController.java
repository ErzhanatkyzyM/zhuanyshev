package kz.springboot.springbootdemo.controllers;


import kz.springboot.springbootdemo.beans.FirstBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/other")
public class OtherController {

    @Autowired private FirstBean firstBean;

    @GetMapping(value = "/about")
    public String about(){
        return "new_about";
    }

}
