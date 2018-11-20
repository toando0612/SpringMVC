package store;

import model.IcdInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface IcdInfoStore extends CrudRepository<IcdInfo, Integer> {
}
