package me.tomprince.coursesearch.api.course;

import com.fasterxml.jackson.annotation.JsonIgnore;
import me.tomprince.coursesearch.api.discipline.Discipline;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "COURSE_SR")
public class Course {

    @EmbeddedId
    private CoursePk disciplineNumber;

    @Column(name = "CREDITHOUR")
    private String creditHour;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "LEVEL_DIV")
    private String levelDivision;

    @Column(name = "PREREQ")
    private String prerequisites;

    public CoursePk getDisciplineNumber() {
        return disciplineNumber;
    }

//    public String getCourseNumber() {
//        return disciplineNumber.getCourseNumber();
//    }
//
//    public String getDiscipline() {
//        return disciplineNumber.getDiscipline();
//    }

    public void setDisciplineNumber(CoursePk disciplineNumber) {
        this.disciplineNumber = disciplineNumber;
    }

    public String getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(String creditHour) {
        this.creditHour = creditHour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLevelDivision() {
        return levelDivision;
    }

    public void setLevelDivision(String levelDivision) {
        this.levelDivision = levelDivision;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "TITLE")
    private String title;
}

