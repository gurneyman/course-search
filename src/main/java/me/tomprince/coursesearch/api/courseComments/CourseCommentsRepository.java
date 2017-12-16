package me.tomprince.coursesearch.api.courseComments;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called semesterRepository
public interface CourseCommentsRepository extends CrudRepository<CourseComments, Long> {}

