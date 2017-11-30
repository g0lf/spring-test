package nick.test.controllers;

import nick.test.entities.Book;
import nick.test.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    BookService bookService;

    @RequestMapping("/")
    public void index(){
        Book book = bookService.addBook("test book for feature 1");
        System.out.println(book.getId());
    }

}
