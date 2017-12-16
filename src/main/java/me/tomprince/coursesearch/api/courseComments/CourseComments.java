package me.tomprince.coursesearch.api.courseComments;

import com.fasterxml.jackson.annotation.JsonIgnore;
import me.tomprince.coursesearch.api.department.Department;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "CRS_COMMENTS_SR")
public class CourseComments {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "CRS_CD")
    private String courseCode;

    @Column(name = "SEMESTER")
    private String semester;

    @Column(name = "CRS_COMMENTS1")
    private String courseCommentsOne;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseCommentsOne() {
        return courseCommentsOne;
    }

    public void setCourseCommentsOne(String courseCommentsOne) {
        this.courseCommentsOne = courseCommentsOne;
    }
}
