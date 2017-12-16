package me.tomprince.coursesearch.api.instructor;

import com.fasterxml.jackson.annotation.JsonIgnore;
import me.tomprince.coursesearch.api.discipline.Discipline;

import javax.persistence.*;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "INSTRUCTOR_SR")
public class Instructor {

    @JsonIgnore
    @EmbeddedId
    private InstructorPk primaryKey;

    public InstructorPk getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(InstructorPk primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getCourseCode() {
        return primaryKey.getCourseCode();
    }

    public String getInstructorLastName() {
        return primaryKey.getInstructorLastName();
    }

    public String getSemester() {
        return primaryKey.getSemester();
    }
}
