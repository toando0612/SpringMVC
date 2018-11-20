package serviceandbean.service;

import model.Drug;
import model.DrugInfo;

import java.util.List;

public interface DrugInfoServiceCustom {

    public List<DrugInfo> getAllDrugInfos();

    public DrugInfo getDrugInfo(int druginfoId);

    public int addDrugInfo(DrugInfo drugInfo);

    public void deleteDrugInfo(int druginfoId);

    public int updateDrugInfo(DrugInfo drugInfo);
}
