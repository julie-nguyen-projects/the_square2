package com.the_square2.Web.Rest;

import com.the_square2.Model.View.LinkBetweenUsersAndCompanies;
import com.the_square2.Service.Impl.LinkBetweenUsersAndCompaniesServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vue.html/links")
public class LinkBetweenUsersAndCompaniesResource {

    private final LinkBetweenUsersAndCompaniesServiceImpl linkUsersCompaniesService;


    public LinkBetweenUsersAndCompaniesResource(LinkBetweenUsersAndCompaniesServiceImpl linkUsersCompaniesService) {
        this.linkUsersCompaniesService = linkUsersCompaniesService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<LinkBetweenUsersAndCompanies> getAllLinksBetweenUsersAndCompanies() {
        return linkUsersCompaniesService.getAll();
    }
}
