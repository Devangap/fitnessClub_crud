package com.example.fitnessClub.fitnessClub.controller;

import com.example.fitnessClub.fitnessClub.Model.Trainer;
import com.example.fitnessClub.fitnessClub.service.TrainerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Simplifies the creation of RESTful web services by combining @Controller and @ResponseBody
@RequestMapping("/trainer") //Maps HTTP requests to specific controller methods
public class trainerController {
    private final TrainerService trainerService;

    public trainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }
//API clients receive clear and structured responses, with appropriate status codes and data
    @GetMapping("/all")
    public ResponseEntity<List<Trainer>> getAllTrainers() {
        List<Trainer> trainers = trainerService.findAllTrainers();
        return new ResponseEntity<>(trainers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Trainer> findTrainerById(@PathVariable("id") Long id) {
        Trainer trainer = trainerService.findTrainerById(id);
        return new ResponseEntity<>(trainer, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Trainer> addTrainer(@RequestBody Trainer trainer){
        Trainer newTrainer = trainerService.addTrainer(trainer);
        return new ResponseEntity<>(newTrainer, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Trainer> updateTrainer(@RequestBody Trainer trainer){
        Trainer updatedTrainer = trainerService.updateTrainer(trainer);
        return new ResponseEntity<>(updatedTrainer, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteTrainerById(@PathVariable("id") Long id) {
        trainerService.deleteTrainer(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
