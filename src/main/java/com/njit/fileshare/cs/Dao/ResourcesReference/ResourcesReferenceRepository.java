package com.njit.fileshare.cs.Dao.ResourcesReference;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourcesReferenceRepository extends JpaRepository<ResourceReferencesEntity,Integer> {
}
