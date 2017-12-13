package me.tomprince.coursesearch.api.semester;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called semesterRepository
public interface SemesterRepository extends CrudRepository<SemesterModel, Long> {}

