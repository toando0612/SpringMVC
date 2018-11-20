package controller;

import model.Icd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import serviceandbean.service.IcdServiceCustom;

import java.util.List;

import static java.lang.Integer.valueOf;

@RestController
@RequestMapping(path = "/")
public class IcdController {
    @Autowired
    private IcdServiceCustom icdServiceCustom;

    @RequestMapping(path = "icds", method = RequestMethod.GET)
    public List<Icd> getIcds(){ return icdServiceCustom.getAllIcds();}

    @RequestMapping(path = "icds", method = RequestMethod.POST)
    public int addIcd(@RequestBody Icd icd){
        return icdServiceCustom.addIcd(icd);
    }

    @RequestMapping(path="icds/{icdId}", method = RequestMethod.DELETE)
    public void deleteIcd(@PathVariable int icdId){icdServiceCustom.deleteIcd(icdId);}


    @RequestMapping(path = "icds", method = RequestMethod.PUT)
    public void updateIcd(@RequestBody Icd icd){
        icdServiceCustom.updateIcd(icd);}

    @RequestMapping(path = "icds/{icdId}", method = RequestMethod.GET)
    public Icd getIcd(@PathVariable int icdId){return icdServiceCustom.getIcd(icdId); }

}
