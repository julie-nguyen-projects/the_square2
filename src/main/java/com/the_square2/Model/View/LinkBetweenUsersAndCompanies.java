package com.the_square2.Model.View;

import lombok.Getter;
import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Immutable
@Getter
@Table(name = "skillsandactdomsbetweenusersandcompanies")
public class LinkBetweenUsersAndCompanies {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "jpid")
    private Long jobPropositionId;

    @Column(name = "jpname")
    private String jobPropositionName;

    @Column(name = "cid")
    private Long companyId;

    @Column(name = "cname")
    private String companyName;

    @Column(name = "companiesandusersforskills")
    private int nbOfSkillsInCommon;

    @Column(name = "companiesandusersforactdomains")
    private int nbOfActDomInCommon;

    public LinkBetweenUsersAndCompanies() {
    }
}
