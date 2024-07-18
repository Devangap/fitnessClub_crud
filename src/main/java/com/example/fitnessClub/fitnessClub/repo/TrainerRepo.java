package com.example.fitnessClub.fitnessClub.repo;

import com.example.fitnessClub.fitnessClub.Model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TrainerRepo extends JpaRepository<Trainer, Long> {
    void deleteTrainerById(long id);
//sometimes it might not return a trainer
    Optional<Trainer> findTrainerById(long id);
}
