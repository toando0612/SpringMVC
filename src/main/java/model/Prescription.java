package model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "prescription")
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "prescription",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DrugInfo> drugInfos;

    @Column
    private String dose;

    @Column
    private String howtouse;

    @OneToOne(cascade = CascadeType.REFRESH)
    private Patient patient;

    public Prescription() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<DrugInfo> getDrugInfos() {
        return drugInfos;
    }

    public void setDrugInfos(List<DrugInfo> drugInfos) {
        this.drugInfos = drugInfos;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getHowtouse() {
        return howtouse;
    }

    public void setHowtouse(String howtouse) {
        this.howtouse = howtouse;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
