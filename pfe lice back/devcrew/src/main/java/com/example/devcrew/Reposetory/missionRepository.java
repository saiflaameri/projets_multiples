package com.example.devcrew.Reposetory;

import com.example.devcrew.entities.mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface missionRepository extends JpaRepository<mission,Long> {
}
