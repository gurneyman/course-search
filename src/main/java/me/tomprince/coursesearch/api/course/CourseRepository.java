package me.tomprince.coursesearch.api.course;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called semesterRepository
public interface CourseRepository extends CrudRepository<Course, Long> {}

