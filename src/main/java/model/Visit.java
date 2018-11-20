package model;

import com.fasterxml.jackson.annotation.*;
import jdk.nashorn.internal.objects.annotations.Property;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CoT on 8/3/18.
 */
@Entity
@Table(name = "visit")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    String date;

    @Column
    private String problems;

    @Column
    private String time;


    @OneToMany(mappedBy = "visit",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<IcdInfo> icdInfos;


    @ManyToOne(cascade = CascadeType.REFRESH)
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Visit() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public List<IcdInfo> getIcdInfos() {
        return icdInfos;
    }

    public void setIcdInfos(List<IcdInfo> icdInfos) {
        this.icdInfos = icdInfos;
    }
}
