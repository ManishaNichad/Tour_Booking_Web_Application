package com.MN.toursProject.Repo;

import com.MN.toursProject.Entities.Lodging;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LodgingRepo extends JpaRepository<Lodging, Long> {
    Lodging findTopByOrderByIdDesc();
}
