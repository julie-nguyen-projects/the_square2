package com.the_square2.Model.View;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Immutable
@Table(name = "userswithatleastonecommonpoint")
public class UsersWithAtLeastOneCommonPoint {

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

    public Long getId() {
        return id;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getCity() {
        return city;
    }

    public UsersWithAtLeastOneCommonPoint() {
    }

    public UsersWithAtLeastOneCommonPoint(Long id, Date birthday, String firstName, String lastName, Long city) {
        this.id = id;
        this.birthday = birthday;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }
}
