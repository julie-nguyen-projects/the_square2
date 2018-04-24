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
    private Set<Skill> skills;

    @ManyToOne
    private Company company;
}
