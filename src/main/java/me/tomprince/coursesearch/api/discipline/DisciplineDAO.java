package me.tomprince.coursesearch.api.discipline;

import me.tomprince.coursesearch.api.department.Department;

public class DisciplineDAO {
    private Discipline discipline;
    private Iterable<Department> departments;

    public DisciplineDAO(Discipline discipline, Iterable<Department> departments) {
        this.discipline = discipline;
        this.departments = departments;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Iterable<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Iterable<Department> departments) {
        this.departments = departments;
    }
}
