package com.the_square2.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@ToString
@Builder
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

    @ManyToMany(mappedBy = "skills")
    private Set<User> users;

    @ManyToMany
    @JoinTable(
            name = "skills_jobs",
            joinColumns = {@JoinColumn(name = "skill_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "job_id", referencedColumnName = "id")}
    )
    private Set<JobProposition> jobPropositions;
}
