package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
public class Job extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;

//    private String name;
    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List skills;


    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, List someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.
    
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Employer getEmployer() {
        return employer;
    }

//    public String getEmployer() {
//        return employer;
//    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

//    public void setEmployer(String employer) {
//        this.employer = employer;
//    }

    public List getSkills() {
        return skills;
    }

    public void setSkills(List skills) {
        this.skills = skills;
    }

}
