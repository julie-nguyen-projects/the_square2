package com.the_square2.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Getter @Setter
@Entity
@Table(name= "user_social")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "birthday")
    private Date birthday;

    @JsonManagedReference("user-city")
    @ManyToOne
    private City city;

    @ManyToMany
    @JoinTable(
            name = "users_skills",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "skill_id", referencedColumnName = "id")}
    )
    private Set<Skill> skills;

    @ManyToMany
    @JoinTable(
            name = "users_hobbies",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "hobby_id", referencedColumnName = "id")}
    )
    private Set<Hobby> hobbies;


    @ManyToMany
    @JoinTable(
            name = "users_companies",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "company_id", referencedColumnName = "id")}
    )
    private Set<Company> companiesRelations;

    @ManyToMany
    @JoinTable(
            name = "users_activities_domains",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "activity_id", referencedColumnName = "id")}
    )
    private Set<ActivityDomain> activities;

    @ManyToMany
    @JoinTable(
            name = "users_training_education_level",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "training_educ_level_id", referencedColumnName = "id")}
    )
    private Set<TrainingEducationLevel> trainingsEducationLevels;

    @ManyToMany
    @JoinTable(
            name = "users_friends",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "friend_id", referencedColumnName = "id")}
    )
    private Set<User> usersRelations;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", city=" + city.getName() + '\'' +
                ", skills=" + skills +
                ", hobbies=" + hobbies +
                ", companiesRelations=" + companiesRelations +
                ", activities=" + activities +
                ", trainingsEducationLevels=" + trainingsEducationLevels +
                ", usersRelations=" + usersRelations +
                '}';
    }
}
