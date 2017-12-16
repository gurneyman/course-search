package me.tomprince.coursesearch.api.discipline;

import me.tomprince.coursesearch.api.department.Department;

public class SingleDisciplineWrapper {
    private Discipline discipline;
    private Department department;

    public SingleDisciplineWrapper(Discipline discipline, Department department) {
        this.discipline = discipline;
        this.department = department;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
