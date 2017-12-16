package me.tomprince.coursesearch.api.instructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class InstructorPk implements Serializable {
    @Column(name = "CRS_CD")
    private String courseCode;

    @Column(name = "INSTRUCTOR_LNAME")
    private String instructorLastName;

    @Column(name = "SEMESTER")
    private String semester;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
