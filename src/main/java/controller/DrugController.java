package controller;

import model.Drug;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import serviceandbean.service.DrugServiceCustom;

import java.util.List;

import static java.lang.Integer.valueOf;

@RestController
@RequestMapping(path = "/")
public class DrugController {

    @Autowired
    private DrugServiceCustom drugServiceCustom;

    @RequestMapping(path="drugs", method = RequestMethod.GET)
    public List<Drug> getAllDrugs() {
        return drugServiceCustom.getAllDrugs();
    }



    @RequestMapping(path = "drugs", method = RequestMethod.POST)
    public Long addDrug(@RequestBody Drug drug){
        return drugServiceCustom.addDrug(drug);
    }



    @RequestMapping(path = "drugs/{drugId}", method = RequestMethod.DELETE)
    public void deleteDrug(@PathVariable Long drugId){
        drugServiceCustom.deleteDrug(drugId);
    }



    @RequestMapping(path = "drugs/{drugId}", method = RequestMethod.PUT)
    public Long updateDrug(@RequestBody Drug drug) {
        return drugServiceCustom.updateDrug(drug);

    }


    @RequestMapping(path = "drugs/{drugId}", method = RequestMethod.GET)
    public Drug getDrug(@PathVariable Long drugId){
        return drugServiceCustom.getDrug(drugId);
    }

}
