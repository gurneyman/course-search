package me.tomprince.coursesearch.api.department;

import com.fasterxml.jackson.annotation.JsonIgnore;
import me.tomprince.coursesearch.api.discipline.Discipline;

import javax.persistence.*;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "DEPT_SR")
public class Department {

    @Id
    private String DEPT_ID;
    private String DEPT_NAME;

    @JsonIgnore
    @OneToMany(mappedBy = "department", cascade= CascadeType.ALL )
    private Set<Discipline> disciplines;

    public Set getDisciplines() {
        return disciplines;
    }
//
//    public void setDisciplines(Set<Discipline> disciplines) {
//        this.disciplines = disciplines;
//    }

    public String getDEPT_ID() {
        return DEPT_ID;
    }

    public void setDEPT_ID(String DEPT_ID) {
        this.DEPT_ID = DEPT_ID;
    }

    public String getDEPT_NAME() {
        return DEPT_NAME;
    }

    public void setDEPT_NAME(String DEPT_NAME) {
        this.DEPT_NAME = DEPT_NAME;
    }
}
