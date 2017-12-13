package me.tomprince.coursesearch.api.discipline;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import me.tomprince.coursesearch.api.department.Department;

import javax.persistence.*;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "DISCIPLINE_SR")
public class Discipline {

    //private String DEPT_ID;
    @Id
    private String DISC_ABBREVIATION;
    private String DISCIPLINE_NAME;
    private String SCHOOL_ID;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="DEPT_ID")
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    //    public String getDEPT_ID() {
//        return DEPT_ID;
//    }
//
//    public void setDEPT_ID(String DEPT_ID) {
//        this.DEPT_ID = DEPT_ID;
//    }

    public String getDISC_ABBREVIATION() {
        return DISC_ABBREVIATION;
    }

    public void setDISC_ABBREVIATION(String DISC_ABBREVIATION) {
        this.DISC_ABBREVIATION = DISC_ABBREVIATION;
    }

    public String getDISCIPLINE_NAME() {
        return DISCIPLINE_NAME;
    }

    public void setDISCIPLINE_NAME(String DISCIPLINE_NAME) {
        this.DISCIPLINE_NAME = DISCIPLINE_NAME;
    }

    public String getSCHOOL_ID() {
        return SCHOOL_ID;
    }

    public void setSCHOOL_ID(String SCHOOL_ID) {
        this.SCHOOL_ID = SCHOOL_ID;
    }
}
