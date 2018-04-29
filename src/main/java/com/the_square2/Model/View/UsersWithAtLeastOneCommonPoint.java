package com.the_square2.Model.View;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
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
}
