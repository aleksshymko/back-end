package de.ait.hw12.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {return "hello.html";}

}
