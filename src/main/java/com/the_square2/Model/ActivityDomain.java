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
@Table(name= "activity_domain")
public class ActivityDomain implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "activities")
    public Set<User> users;

    @ManyToMany
    @JoinTable(
            name = "activities_companies",
            joinColumns = {@JoinColumn(name = "activity_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "company_id", referencedColumnName = "id")}
    )
    private Set<Company> companies;
}
