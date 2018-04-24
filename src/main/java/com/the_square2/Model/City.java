package com.the_square2.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name= "city")
public class City {

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<User> users = new HashSet<>();
}
