package de.ait.hw12.controllers;

import de.ait.hw12.classes.Books;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BooksRestController {
    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Books> getBooks() {
        List<Books> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Books("Harry Potter","Rowling"));
        listOfBooks.add(new Books("Big Boss","unknown"));
        return listOfBooks;
    }
}
