package model;

import javax.persistence.*;

@Entity
@Table(name = "icdinfo")
public class IcdInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @ManyToOne(cascade = CascadeType.REFRESH)
    private Icd icd;


    @ManyToOne(cascade = CascadeType.REFRESH)
    private Visit visit;

    public IcdInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Icd getIcd() {
        return icd;
    }

    public void setIcd(Icd icd) {
        this.icd = icd;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }
}
