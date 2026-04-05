package com.smartcampus.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smartcampus.backend.model.Resource;
import com.smartcampus.backend.model.Resource.ResourceStatus;
import com.smartcampus.backend.model.Resource.ResourceType;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resource, Long> {
    List<Resource> findByStatus(ResourceStatus status);
    List<Resource> findByType(ResourceType type);
    List<Resource> findByStatusAndType(ResourceStatus status, ResourceType type);
    List<Resource> findByNameContainingIgnoreCase(String name);
}
