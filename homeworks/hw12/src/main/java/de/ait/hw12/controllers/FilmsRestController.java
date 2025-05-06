package de.ait.hw12.controllers;

import de.ait.hw12.classes.Films;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmsRestController {
    @RequestMapping(value = "/films", method = RequestMethod.GET)
    public List<Films> getFilms() {
        List<Films> listOfFilms = new ArrayList<>();
                listOfFilms.add(new Films("Gentleman's","England"));
                listOfFilms.add(new Films("Операция Ы", "СССР"));
        return listOfFilms;
    }
}
