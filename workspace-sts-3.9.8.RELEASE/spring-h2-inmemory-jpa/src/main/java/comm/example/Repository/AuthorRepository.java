package comm.example.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comm.example.Model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

	

}
