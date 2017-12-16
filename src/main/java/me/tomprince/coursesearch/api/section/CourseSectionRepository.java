package me.tomprince.coursesearch.api.section;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called semesterRepository
public interface CourseSectionRepository extends CrudRepository<CourseSection, Long> {}

