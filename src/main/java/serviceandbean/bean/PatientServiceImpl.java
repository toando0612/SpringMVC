package serviceandbean.bean;

import model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import serviceandbean.service.PatientServiceCustom;
import store.PatientStore;

import java.util.List;

@Service
@Transactional
public class PatientServiceImpl implements PatientServiceCustom {

    @Autowired
    public PatientStore patientStore;


    public void setPatientStore(PatientStore patientStore) {
        this.patientStore = patientStore;
    }

    @Override
    public List<Patient> getAllPatients() {
        return (List<Patient>) patientStore.findAll();
    }

    @Override
    public int addPatient(Patient patient) {
        return patientStore.save(patient).getId();
    }

    @Override
    public Patient getPatient(int patientId) {
        return patientStore.findOne(patientId);
    }

    @Override
    public void deletePatient(int patientId) {
        patientStore.delete(patientId);
    }

    @Override
    public int updatePatient(Patient patient) {
        return patientStore.save(patient).getId();
    }

    @Override
    public List<Patient> getAllByBirthday(String birth) {
        return patientStore.getAllByBirthday(birth);
    }


    @Override
    public List<Patient> getAllByName(String name) {
        return patientStore.getAllByName(name);
    }
}
