package controller;

import model.Drug;
import model.DrugInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import serviceandbean.service.DrugInfoServiceCustom;
import serviceandbean.service.DrugServiceCustom;

import java.util.List;

import static java.lang.Integer.valueOf;

@RestController
@RequestMapping(path = "/")
public class DrugInfoController {

    @Autowired
    private DrugInfoServiceCustom drugInfoServiceCustom;

    @RequestMapping(path = "druginfos", method = RequestMethod.GET)
    public List<DrugInfo> getAllDrugInfos(){ return drugInfoServiceCustom.getAllDrugInfos();}

    @RequestMapping(path = "druginfos", method = RequestMethod.POST)
    public int addDrugInfo(@RequestBody DrugInfo drugInfo){
        return drugInfoServiceCustom.addDrugInfo(drugInfo);
    }

    @RequestMapping(path="druginfos/{druginfoId}", method = RequestMethod.DELETE)
    public void deleteDrugInfo(@PathVariable int druginfoId){drugInfoServiceCustom.deleteDrugInfo(druginfoId);}


    @RequestMapping(path = "druginfos", method = RequestMethod.PUT)
    public void updateDrugInfo(@RequestBody DrugInfo drugInfo){drugInfoServiceCustom.updateDrugInfo(drugInfo);}

    @RequestMapping(path = "druginfos/{druginfoId}", method = RequestMethod.GET)
    public DrugInfo getDrugInfo(@PathVariable int druginfoId){return drugInfoServiceCustom.getDrugInfo(druginfoId); }

}
