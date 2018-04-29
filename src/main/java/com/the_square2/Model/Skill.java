package com.the_square2.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name= "skill")
public class Skill implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "skills_jobs",
            joinColumns = {@JoinColumn(name = "skill_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "job_id", referencedColumnName = "id")}
    )
    private Set<JobProposition> jobPropositions = new HashSet<>();

    public Skill() {
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
