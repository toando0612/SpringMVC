package serviceandbean.bean;

import model.DrugInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import serviceandbean.service.DrugInfoServiceCustom;
import store.DrugInfoStore;

import java.util.List;
@Service
@Transactional
public class DrugInfoServiceImpl implements DrugInfoServiceCustom {
    @Autowired
    DrugInfoStore drugInfoStore;

    public void setDrugInfoStore(DrugInfoStore drugInfoStore) {
        this.drugInfoStore = drugInfoStore;
    }

    @Override
    public List<DrugInfo> getAllDrugInfos() {
        return (List<DrugInfo>) drugInfoStore.findAll();
    }

    @Override
    public DrugInfo getDrugInfo(int druginfoId) {
        return drugInfoStore.findOne(druginfoId);
    }

    @Override
    public int addDrugInfo(DrugInfo drugInfo) {
        return drugInfoStore.save(drugInfo).getId();
    }

    @Override
    public void deleteDrugInfo(int druginfoId) {
        drugInfoStore.delete(druginfoId);
    }

    @Override
    public int updateDrugInfo(DrugInfo drugInfo) {
        return drugInfoStore.save(drugInfo).getId();
    }
}
