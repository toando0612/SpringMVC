package serviceandbean.bean;

import model.IcdInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import serviceandbean.service.IcdInfoServiceCustom;
import store.IcdInfoStore;

import javax.persistence.Entity;
import java.util.List;

@Service
@Transactional
public class IcdInfoServiceImpl implements IcdInfoServiceCustom {

    @Autowired
    private IcdInfoStore icdInfoStore;

    public void setIcdInfoStore(IcdInfoStore icdInfoStore) {
        this.icdInfoStore = icdInfoStore;
    }

    @Override
    public List<IcdInfo> getAllIcdinfos() {
        return (List<IcdInfo>) icdInfoStore.findAll();
    }

    @Override
    public IcdInfo getIcdinfo(int icdinfoId) {
        return icdInfoStore.findOne(icdinfoId);
    }

    @Override
    public int addIcdinfo(IcdInfo icdInfo) {
        return icdInfoStore.save(icdInfo).getId();
    }

    @Override
    public void deleteIcdinfo(int icdinfoId) {
        icdInfoStore.delete(icdinfoId);

    }

    @Override
    public int updateIcdinfo(IcdInfo icdInfo) {
        return icdInfoStore.save(icdInfo).getId();
    }
}
