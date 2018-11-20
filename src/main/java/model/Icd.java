package model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "icd")
public class Icd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String chaptercode;
    @Column
    private String chaptername;
    @Column
    private String groupcode;
    @Column
    private String groupname;
    @Column
    private String typecode;
    @Column
    private String typename;
    @Column
    private String diseasecode;
    @Column
    private String diseasename;

    @OneToMany(mappedBy = "icd",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<IcdInfo> icdInfos;

    public Icd() {
    }

    public String getChaptercode() {
        return chaptercode;
    }

    public void setChaptercode(String chaptercode) {
        this.chaptercode = chaptercode;
    }

    public String getChaptername() {
        return chaptername;
    }

    public void setChaptername(String chaptername) {
        this.chaptername = chaptername;
    }

    public String getGroupcode() {
        return groupcode;
    }

    public void setGroupcode(String groupcode) {
        this.groupcode = groupcode;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getDiseasecode() {
        return diseasecode;
    }

    public void setDiseasecode(String diseasecode) {
        this.diseasecode = diseasecode;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
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
