package com.the_square2.Model;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Entity
@Table(name= "hobby")
public class Hobby implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private long id;

    @Column(name = "name")
    private String name;

    public Hobby() {
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
