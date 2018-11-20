package serviceandbean.service;

import model.IcdInfo;

import java.util.List;

public interface IcdInfoServiceCustom {

    public List<IcdInfo> getAllIcdinfos();

    public IcdInfo getIcdinfo(int icdinfoId);

    public int addIcdinfo(IcdInfo icdInfo);

    public void deleteIcdinfo(int icdinfoId);

    public int updateIcdinfo(IcdInfo icdInfo);
}
