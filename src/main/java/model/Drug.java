package model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.xml.soap.Text;
import java.sql.Clob;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "drug")
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Type(type = "org.hibernate.type.TextType")
    private String name;

    @OneToMany(mappedBy = "drug",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<DrugInfo> drugInfos = new ArrayList<>();

    public Drug() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public DrugInfo getDrugInfo() {
//        return drugInfo;
//    }
//
//    public void setDrugInfo(DrugInfo drugInfo) {
//        this.drugInfo = drugInfo;
//    }

    public List<DrugInfo> getDrugInfos() {
        return drugInfos;
    }

    public void setDrugInfos(List<DrugInfo> drugInfos) {
        this.drugInfos = drugInfos;
    }
}
