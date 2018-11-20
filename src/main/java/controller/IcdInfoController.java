package controller;

import model.IcdInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import serviceandbean.service.IcdInfoServiceCustom;

import java.util.List;

@RestController
@RequestMapping(path = "/")
public class IcdInfoController {
    @Autowired
    private IcdInfoServiceCustom icdInfoServiceCustom;

    @RequestMapping(path = "icdinfos", method = RequestMethod.GET)
    public List<IcdInfo> getIcdinfos(){ return icdInfoServiceCustom.getAllIcdinfos();}

    @RequestMapping(path = "icdinfos", method = RequestMethod.POST)
    public int addIcdinfo(@RequestBody IcdInfo icdInfo){
        return icdInfoServiceCustom.addIcdinfo(icdInfo);
    }

    @RequestMapping(path="icdinfos/{icdinfoId}", method = RequestMethod.DELETE)
    public void deleteIcdinfo(@PathVariable int icdinfoId){icdInfoServiceCustom.deleteIcdinfo(icdinfoId);}


    @RequestMapping(path = "icdinfos", method = RequestMethod.PUT)
    public void updateIcdinfo(@RequestBody IcdInfo icdInfo){
        icdInfoServiceCustom.updateIcdinfo(icdInfo);}

    @RequestMapping(path = "icdinfos/{icdinfoId}", method = RequestMethod.GET)
    public IcdInfo getIcdinfo(@PathVariable int icdinfoId){return icdInfoServiceCustom.getIcdinfo(icdinfoId); }
}
