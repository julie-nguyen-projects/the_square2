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
@Table(name= "company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "siret")
    private long siret;

    @Column(name = "siren")
    private long siren;

    @Column(name = "description")
    private String description;

    @ManyToMany(mappedBy = "companiesRelations")
    private Set<User> usersRelations;

    @OneToMany(mappedBy = "company")
    private Set<JobProposition> jobPropositions;

    @ManyToMany(mappedBy = "companies")
    private Set<ActivityDomain> activities;
}
