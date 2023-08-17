package com.example.devcrew.Reposetory;

import com.example.devcrew.entities.vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface vehiculeRepository extends JpaRepository<vehicule,Long> {
    List<vehicule> findByDisponible(boolean Disponible);


}
