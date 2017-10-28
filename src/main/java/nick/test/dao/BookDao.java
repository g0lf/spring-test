package nick.test.dao;

import nick.test.entities.Book;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Repository
public class BookDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void save(Book book){
        em.persist(book);
    }


}
