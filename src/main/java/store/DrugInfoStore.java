package store;

import model.DrugInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrugInfoStore extends CrudRepository<DrugInfo, Integer> {
}
