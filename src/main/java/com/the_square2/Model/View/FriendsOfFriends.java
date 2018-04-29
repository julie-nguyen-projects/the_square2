package com.the_square2.Model.View;

import lombok.Getter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Immutable
@Getter
@Table(name = "friendsoffriends")
public class FriendsOfFriends {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "cityId")
    private Long city;

    public FriendsOfFriends() {
    }
}
