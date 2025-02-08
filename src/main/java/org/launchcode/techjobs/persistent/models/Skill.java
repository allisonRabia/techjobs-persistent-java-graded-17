package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Skill(){
    };

    public List<Job> getJobs() {
        return jobs;
    }

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();
}
