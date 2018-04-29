package com.the_square2.Model;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name= "job_proposition")
public class JobProposition implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "jobPropositions")
    private Set<Skill> skills = new HashSet<>();

    @ManyToOne
    private Company company;

    private String jobDescription;

    private int grossWage;

    public JobProposition() {
    }

    @Override
    public String toString() {
        return "JobProposition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                ", company=" + company +
                ", jobDescription='" + jobDescription + '\'' +
                ", grossWage=" + grossWage +
                '}';
    }
}
