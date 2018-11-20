package store;

import model.Icd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IcdStore extends CrudRepository<Icd, Integer> {

}
