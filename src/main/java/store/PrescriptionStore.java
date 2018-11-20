package store;

import model.Prescription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrescriptionStore extends CrudRepository<Prescription, Integer> {
}
