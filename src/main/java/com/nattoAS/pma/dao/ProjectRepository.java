package com.nattoAS.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.nattoAS.pma.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	
}
