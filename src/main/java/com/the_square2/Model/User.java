package com.the_square2.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Set;

@Entity
@Table(name= "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "birthdate")
    private Instant birthdate;

    @ManyToOne
    private City city;

    @ManyToMany
    @JoinTable(
            name = "users_skills",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "skill_name", referencedColumnName = "name")}
    )
    private Set<Skill> skills;

    @ManyToMany
    @JoinTable(
            name = "users_hobbies",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "hobby_name", referencedColumnName = "name")}
    )
    private Set<Hobby> hobbies;



}
