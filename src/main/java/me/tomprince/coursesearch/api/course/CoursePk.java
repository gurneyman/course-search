package me.tomprince.coursesearch.api.course;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CoursePk implements Serializable {
    @Column(name = "COURSENUMBER")
    private String courseNumber;

    @Column(name="DISCIPLINE")
    private String discipline;

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
}