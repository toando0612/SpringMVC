package store;

import model.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import serviceandbean.service.PatientServiceCustom;

import java.util.List;

@Repository
public interface PatientStore extends CrudRepository<Patient, Integer> {
    public List<Patient> getAllByBirthday(String s);

    public List<Patient> getAllByName(String s);

}
