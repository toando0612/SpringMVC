package store;
import javafx.beans.property.Property;
import model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import serviceandbean.service.VisitServiceCustom;

import java.util.List;

@Repository
public interface VisitStore extends CrudRepository<Visit, Integer> {
     List<Visit> getAllByPatient_Id(int id);
     List<Visit> getAllByDate(String date);
}
