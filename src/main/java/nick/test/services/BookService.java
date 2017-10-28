package nick.test.services;

import nick.test.dao.BookDao;
import nick.test.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    @Autowired
    BookDao bookDao;

    public Book addBook(String name){
        Book book = new Book();
        book.setName(name);
        System.out.println(book.getId());
        bookDao.save(book);
        System.out.println(book.getId());
        return  book;
    }

}
