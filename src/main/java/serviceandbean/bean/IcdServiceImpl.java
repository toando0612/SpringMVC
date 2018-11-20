package serviceandbean.bean;

import model.Icd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import serviceandbean.service.IcdServiceCustom;
import store.IcdStore;

import java.util.List;

@Service
@Transactional
public class IcdServiceImpl implements IcdServiceCustom {

    @Autowired
    public IcdStore icdStore;


    public void setIcdStore(IcdStore icdStore) {
        this.icdStore = icdStore;
    }

    @Override
    public List<Icd> getAllIcds() {
        return (List<Icd>) icdStore.findAll();
    }

    @Override
    public Icd getIcd(int icdId) {
        return icdStore.findOne(icdId);
    }

    @Override
    public int addIcd(Icd icd) {
        return icdStore.save(icd).getId();
    }

    @Override
    public void deleteIcd(int icdId) {
        icdStore.delete(icdId);
    }

    @Override
    public int updateIcd(Icd icd) {
        return icdStore.save(icd).getId();
    }
}
