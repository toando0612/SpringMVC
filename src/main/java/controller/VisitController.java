package controller;

import model.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import serviceandbean.service.VisitServiceCustom;

import javax.swing.text.View;
import java.util.List;

import static java.lang.Integer.valueOf;

@RestController
@RequestMapping(path = "/")
public class VisitController {

    @Autowired
    private VisitServiceCustom visitServiceCustom;

    @RequestMapping(path = "visits", method = RequestMethod.GET)
    public List<Visit> getAllVisits(){
        return (List<Visit>) visitServiceCustom.getAllVisits();
    }

    @RequestMapping(path = "visits", method = RequestMethod.POST)
    public void addVisit(@RequestBody Visit visit){
         visitServiceCustom.addVisit(visit);
    }

    @RequestMapping(path="visits/{visitId}", method = RequestMethod.DELETE)
    public void deleteVisit(@PathVariable int visitId){visitServiceCustom.deleteVisit(valueOf(visitId));}


    @RequestMapping(path = "visits", method = RequestMethod.PUT)
    public void updateVisit(@RequestBody Visit visit){visitServiceCustom.updateVisit(visit);}

    @RequestMapping(path = "visits/{visitId}", method = RequestMethod.GET)
    public Visit getVisit(@PathVariable int visitId){return visitServiceCustom.getVisit(valueOf(visitId)); }

    @RequestMapping(path = "visits/findbydate/{date}", method = RequestMethod.GET)
    public List<Visit> getAllByDate(@PathVariable String date){
        return visitServiceCustom.getAllByDate(date);
    }

    @RequestMapping(path = "visits/findbypatient/{id}", method = RequestMethod.GET)
    public List<Visit> getAllByPatient_Id(@PathVariable int id){
        return visitServiceCustom.getAllByPatient_Id(id);
    }

    @RequestMapping(path = "visits/countbydate/{date}", method = RequestMethod.GET)
    public long countByDate(@PathVariable String date){
        return visitServiceCustom.countVisitsByDate(date);
    }



}
