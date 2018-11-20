package serviceandbean.service;


import model.Visit;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VisitServiceCustom {
    public List<Visit> getAllVisits();

    public Visit getVisit(int visitId);

    public void addVisit(Visit visit);

    public void deleteVisit(int visitId);

    public int updateVisit(Visit visit);

    public List<Visit> getAllByDate(String date);

    public List<Visit> getAllByPatient_Id(int id);

    int countVisitsByDate(String date);

}
