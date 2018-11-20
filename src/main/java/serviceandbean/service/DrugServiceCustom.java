package serviceandbean.service;

import model.Drug;

import java.util.List;

public interface DrugServiceCustom {
    public List<Drug> getAllDrugs();

    public Drug getDrug(Long drugId);

    public Long addDrug(Drug drug);

    public void deleteDrug(Long drugId);

    public Long updateDrug(Drug drug);
}
