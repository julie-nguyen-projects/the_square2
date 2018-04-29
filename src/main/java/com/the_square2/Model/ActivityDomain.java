package com.the_square2.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name= "activity_domain")
public class ActivityDomain implements Serializable {

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
            name = "activities_companies",
            joinColumns = {@JoinColumn(name = "activity_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "company_id", referencedColumnName = "id")}
    )
    private Set<Company> companies = new HashSet<>();

    public ActivityDomain() {
    }

    @Override
    public String toString() {
        return "ActivityDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
