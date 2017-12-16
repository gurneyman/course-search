package me.tomprince.coursesearch.api.instructor;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called semesterRepository
public interface InstructorRepository extends CrudRepository<Instructor, Long> {}

