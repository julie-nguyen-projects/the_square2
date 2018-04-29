package com.the_square2.Service.Impl;

import com.the_square2.Model.View.LinkBetweenUsersAndCompanies;
import com.the_square2.Repository.LinkBetweenUsersAndCompaniesRepository;
import com.the_square2.Service.LinkBetweenUsersAndCompaniesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service(value = "linkUsersCompaniesService")
@Transactional
public class LinkBetweenUsersAndCompaniesServiceImpl implements LinkBetweenUsersAndCompaniesService {

    @Resource
    private final LinkBetweenUsersAndCompaniesRepository linkRepository;

    public LinkBetweenUsersAndCompaniesServiceImpl(LinkBetweenUsersAndCompaniesRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @Override
    public List<LinkBetweenUsersAndCompanies> getAll() {
        return this.linkRepository.findAll();
    }
}
