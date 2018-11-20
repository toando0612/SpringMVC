package serviceandbean.service;


import model.Patient;

import java.util.List;


public interface PatientServiceCustom {
    public List<Patient> getAllPatients();

    public Patient getPatient(int patientId);

    public int addPatient(Patient patient);

    public void deletePatient(int patientId);

    public int updatePatient(Patient patient);

    public List<Patient> getAllByBirthday(String birth);

    public List<Patient> getAllByName(String name);






}
