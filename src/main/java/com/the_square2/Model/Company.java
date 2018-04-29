package com.the_square2.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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

    @JsonIgnore
    @ManyToMany(mappedBy = "companiesRelations")
    private Set<User> usersRelations = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private Set<JobProposition> jobPropositions = new HashSet<>();

    @JsonIgnore
    @ManyToMany(mappedBy = "companies")
    private Set<ActivityDomain> activities = new HashSet<>();

    public Company() {
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", siret=" + siret +
                ", siren=" + siren +
                ", description='" + description + '\'' +
                '}';
    }
}
