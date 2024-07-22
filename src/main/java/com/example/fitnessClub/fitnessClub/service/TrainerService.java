package com.example.fitnessClub.fitnessClub.service;

import com.example.fitnessClub.fitnessClub.Exception.UserNotFoundException;
import com.example.fitnessClub.fitnessClub.Model.Trainer;
import com.example.fitnessClub.fitnessClub.repo.TrainerRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class TrainerService {

    private final TrainerRepo trainerRepo;

    @Autowired // automatically injects the required dependencies
    public TrainerService(TrainerRepo trainerRepo) {
        this.trainerRepo = trainerRepo;
    }

    public Trainer addTrainer(Trainer trainer){
        trainer.setTrainerID(UUID.randomUUID().toString());
        return trainerRepo.save(trainer);
    }

    public List<Trainer> findAllTrainers(){
        return trainerRepo.findAll();
    }

    public Trainer updateTrainer(Trainer trainer){
        return trainerRepo.save(trainer);
    }
    @Transactional //provides automatic rollback and commit functionalities
    public void deleteTrainer(Long id){
        trainerRepo.deleteTrainerById(id);
    }

    public Trainer findTrainerById(long id){
        return trainerRepo.findTrainerById(id).orElseThrow(() ->new UserNotFoundException("User by id " + id + "was not found"));
    }
}
