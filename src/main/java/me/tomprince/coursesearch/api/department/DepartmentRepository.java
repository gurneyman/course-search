package me.tomprince.coursesearch.api.department;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called semesterRepository
public interface DepartmentRepository extends CrudRepository<Department, Long> {}

