package org.launchcode.techjobs.persistent.models;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    @Size(max = 100, min = 1, message = "Name must be at least 1 characters long")
    private String location;

    public @Size(max = 100, min = 1, message = "Name must be at least 1 characters long") String getLocation() {
        return location;
    }

    public void setLocation(@Size(max = 100, min = 1, message = "Name must be at least 1 characters long") String location) {
        this.location = location;
    }

    public Employer(){}

    @OneToMany
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();
}
