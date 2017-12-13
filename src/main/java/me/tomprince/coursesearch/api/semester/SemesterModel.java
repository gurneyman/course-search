package me.tomprince.coursesearch.api.semester;

import javax.persistence.*;
import java.util.Date;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "SEMESTER_SR")
public class SemesterModel {
    @Id
    private String SEMESTER_ID;
    private Date START_DATE;
    private Date END_DATE;
    private String SEMESTER_NAME;
    private String SEMESTER;

    public String getSEMESTER_ID() {
        return SEMESTER_ID;
    }

    public void setSEMESTER_ID(String SEMESTER_ID) {
        this.SEMESTER_ID = SEMESTER_ID;
    }

    public Date getSTART_DATE() {
        return START_DATE;
    }

    public void setSTART_DATE(Date START_DATE) {
        this.START_DATE = START_DATE;
    }

    public Date getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(Date END_DATE) {
        this.END_DATE = END_DATE;
    }

    public String getSEMESTER_NAME() {
        return SEMESTER_NAME;
    }

    public void setSEMESTER_NAME(String SEMESTER_NAME) {
        this.SEMESTER_NAME = SEMESTER_NAME;
    }

    public String getSEMESTER() {
        return SEMESTER;
    }

    public void setSEMESTER(String SEMESTER) {
        this.SEMESTER = SEMESTER;
    }
}
