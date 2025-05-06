package de.ait.hw12.controllers;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class DateRestController {
    @RequestMapping(value = "/now",method = RequestMethod.GET)
    public LocalDateTime now() {return LocalDateTime.now();}
}
