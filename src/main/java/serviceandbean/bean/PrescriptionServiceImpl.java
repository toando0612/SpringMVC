package serviceandbean.bean;


import model.Prescription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import serviceandbean.service.PrescriptionServiceCustom;
import store.PrescriptionStore;

import java.util.List;

@Service
@Transactional
public class PrescriptionServiceImpl implements PrescriptionServiceCustom {

    @Autowired
    public PrescriptionStore prescriptionStore;

    public void setPrescriptionStore(PrescriptionStore prescriptionStore) {
        this.prescriptionStore = prescriptionStore;
    }

    @Override
    public List<Prescription> getAllPrescriptions() {
        return (List<Prescription>) prescriptionStore.findAll();
    }

    @Override
    public Prescription getPrescription(int prescriptionId) {
        return prescriptionStore.findOne(prescriptionId);
    }

    @Override
    public int addPrescription(Prescription prescription) {
        return prescriptionStore.save(prescription).getId();
    }

    @Override
    public void deletePrescription(int prescriptionId) {
        prescriptionStore.delete(prescriptionId);
    }

    @Override
    public int updatePrescription(Prescription prescription) {
        return prescriptionStore.save(prescription).getId();
    }
}
