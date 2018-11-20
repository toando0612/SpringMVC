package controller;

import model.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import serviceandbean.service.PrescriptionServiceCustom;

import java.util.List;

import static java.lang.Integer.valueOf;

/**
 * Created by CoT on 7/29/18.
 */
@RestController
@RequestMapping(path = "/")
public class PrescriptionController {

    @Autowired
    private PrescriptionServiceCustom prescriptionServiceCustom;

    @RequestMapping(path="prescriptions", method = RequestMethod.GET)
    public List<Prescription> getAllPrescriptions() {
        return prescriptionServiceCustom.getAllPrescriptions();
    }



    @RequestMapping(path = "prescriptions", method = RequestMethod.POST)
    public int addPrescription(@RequestBody Prescription prescription){
        return prescriptionServiceCustom.addPrescription(prescription);
    }



    @RequestMapping(path = "prescriptions/{prescriptionId}", method = RequestMethod.DELETE)
    public void deletePrescription(@PathVariable int prescriptionId){
        prescriptionServiceCustom.deletePrescription(prescriptionId);
    }



    @RequestMapping(path = "prescriptions/{prescriptionId}", method = RequestMethod.PUT)
    public int updatePrescription(@RequestBody Prescription prescription) {
        return prescriptionServiceCustom.updatePrescription(prescription);

    }


    @RequestMapping(path = "prescriptions/{prescriptionId}", method = RequestMethod.GET)
    public Prescription getPrescription(@PathVariable int prescriptionId){
        return prescriptionServiceCustom.getPrescription(prescriptionId);
    }


}
