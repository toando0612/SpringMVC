package serviceandbean.bean;

import model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import serviceandbean.service.DrugServiceCustom;
import store.DrugStore;

import java.util.List;

@Service
@Transactional
public class DrugServiceImpl implements DrugServiceCustom {

    @Autowired
    public DrugStore drugStore;

    public void setDrugStore(DrugStore drugStore) {
        this.drugStore = drugStore;
    }

    @Override
    public List<Drug> getAllDrugs() {
        return (List<Drug>) drugStore.findAll();
    }

    @Override
    public Drug getDrug(Long drugId) {
        return drugStore.findOne(drugId);
    }

    @Override
    public Long addDrug(Drug drug) {
        return drugStore.save(drug).getId();
    }

    @Override
    public void deleteDrug(Long drugId) {
        drugStore.delete(drugId);
    }

    @Override
    public Long updateDrug(Drug drug) {
        return drugStore.save(drug).getId();
    }
}
