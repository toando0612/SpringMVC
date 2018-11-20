package store;

import model.Drug;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugStore extends CrudRepository<Drug, Long> {
}
