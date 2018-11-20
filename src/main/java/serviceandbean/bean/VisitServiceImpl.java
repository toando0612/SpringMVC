package serviceandbean.bean;


import model.Visit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import serviceandbean.service.VisitServiceCustom;
import store.VisitStore;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Transactional
@Qualifier("visitServiceCustom")
public class VisitServiceImpl implements VisitServiceCustom {

    @Autowired
    @Qualifier("visitStore")
    public VisitStore visitStore;


    public void setVisitStore(VisitStore visitStore) {
        this.visitStore = visitStore;
    }

    @Override
    public List<Visit> getAllVisits() {
        return (List<Visit>) visitStore.findAll();
    }

    @Override
    public void addVisit(Visit visit) {
        DateFormat  dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        DateFormat  timeFormat = new SimpleDateFormat("hh-mm-ss");
        Date time = new Date();
        Date date = new Date();
        visit.setDate(dateFormat.format(date));
        visit.setTime(timeFormat.format(time));
        visitStore.save(visit);
    }

    @Override
    public Visit getVisit(int visitId) {
        return visitStore.findOne(visitId);
    }

    @Override
    public void deleteVisit(int visitId) {
        visitStore.delete(visitId);
    }

    @Override
    public int updateVisit(Visit visit) {
        return visitStore.save(visit).getId();
    }

    @Override
    public List<Visit> getAllByDate(String date) {
        return visitStore.getAllByDate(date);
    }

    @Override
    public List<Visit> getAllByPatient_Id(int id) {
        return visitStore.getAllByPatient_Id(id);
    }

    @Override
    public int countVisitsByDate(String date) {
        return visitStore.getAllByDate(date).size();

        }

}
