package com.MN.toursProject.Repo;

import com.MN.toursProject.Entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location, Long> {
    Location findTopByOrderByIdDesc();
}
