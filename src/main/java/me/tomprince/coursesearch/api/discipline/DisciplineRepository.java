package me.tomprince.coursesearch.api.discipline;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called semesterRepository
public interface DisciplineRepository extends CrudRepository<Discipline, Long> {}

