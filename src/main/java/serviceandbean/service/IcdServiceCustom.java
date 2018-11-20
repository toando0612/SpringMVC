package serviceandbean.service;

import model.Icd;

import java.util.List;

public interface IcdServiceCustom {
    public List<Icd> getAllIcds();

    public Icd getIcd(int icdId);

    public int addIcd(Icd icd);

    public void deleteIcd(int icdId);

    public int updateIcd(Icd icd);
}
