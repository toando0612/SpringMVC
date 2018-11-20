package serviceandbean.service;

import model.Prescription;

import java.util.List;

public interface PrescriptionServiceCustom {
    public List<Prescription> getAllPrescriptions();

    public Prescription getPrescription(int prescriptionId);

    public int addPrescription(Prescription prescription);

    public void deletePrescription(int prescriptionId);

    public int updatePrescription(Prescription prescription);
}
