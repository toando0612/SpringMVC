package controller;

import model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import serviceandbean.service.PatientServiceCustom;

import java.util.List;

import static java.lang.Integer.valueOf;

/**
 * Created by CoT on 7/29/18.
 */
@RestController
@RequestMapping(path = "/")
public class PatientController { //is the place to declare the url to access to the data

    @Autowired
    private PatientServiceCustom patientServiceCustom;

    @RequestMapping(path="patients", method = RequestMethod.GET)
    public List<Patient> getAllPatients() {
        return (List<Patient>) patientServiceCustom.getAllPatients();
    }



    @RequestMapping(path = "patients", method = RequestMethod.POST)
    public void addPatient(@RequestBody Patient patient){
         patientServiceCustom.addPatient(patient);
    }



    @RequestMapping(path = "patients/{patientId}", method = RequestMethod.DELETE)
    public void deletePatient(@PathVariable int patientId){
        patientServiceCustom.deletePatient(valueOf(patientId));
    }



    @RequestMapping(path = "patients", method = RequestMethod.PUT)
    public int updatePatient(@RequestBody Patient patient) {
       return patientServiceCustom.updatePatient(patient);

    }


    @RequestMapping(path = "patients/{patientId}", method = RequestMethod.GET)
    public Patient getPatient(@PathVariable int patientId){
        return patientServiceCustom.getPatient(valueOf(patientId));
    }


    @RequestMapping(path = "patients/findbybirthday/{birthday}", method = RequestMethod.GET)
    public List<Patient> getAllByBirthday(@PathVariable String birthday){
        return patientServiceCustom.getAllByBirthday(birthday);
    }

    @RequestMapping(path = "patients/findbyname/{name}", method = RequestMethod.GET)
    public List<Patient> getAllByName(@PathVariable String name){
        return patientServiceCustom.getAllByName(name);
    }


}
