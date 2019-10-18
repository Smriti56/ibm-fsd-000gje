package comm.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comm.example.Model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
