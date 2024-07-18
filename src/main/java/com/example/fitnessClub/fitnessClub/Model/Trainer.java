package com.example.fitnessClub.fitnessClub.Model;
import jakarta.persistence.*;

import java.io.Serializable;


//serializable helps transform java class into different kinds of streams
@Entity
public class Trainer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String fullName;
    private String dob;
    private String gender;
    private String contactNum;
    private String imageURL;
    private int experience;
    @Column(nullable = false, updatable = false)
    private String trainerID;


    public Trainer(){}

    public Trainer(Long id, String fullName, String dob, String gender, String contactNum, String imageURL, String trainerID, int experience) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.gender = gender;
        this.contactNum = contactNum;
        this.imageURL = imageURL;
        this.trainerID = trainerID;
        this.experience = experience;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(String trainerID) {
        this.trainerID = trainerID;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
