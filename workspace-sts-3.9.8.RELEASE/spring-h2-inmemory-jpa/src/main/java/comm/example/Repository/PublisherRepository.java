package comm.example.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import comm.example.Model.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
