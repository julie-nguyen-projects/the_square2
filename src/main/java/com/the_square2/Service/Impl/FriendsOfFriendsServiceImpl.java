package com.the_square2.Service.Impl;

import com.the_square2.Model.View.FriendsOfFriends;
import com.the_square2.Repository.FriendsOfFriendsRepository;
import com.the_square2.Service.FriendsOfFriendsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service(value = "friendsOfFriendsService")
@Transactional
public class FriendsOfFriendsServiceImpl implements FriendsOfFriendsService {

    @Resource
    private final FriendsOfFriendsRepository friendsOfFriendsRepository;

    public FriendsOfFriendsServiceImpl(FriendsOfFriendsRepository friendsOfFriendsRepository) {
        this.friendsOfFriendsRepository = friendsOfFriendsRepository;
    }


    @Override
    public List<FriendsOfFriends> getAll() {
        return friendsOfFriendsRepository.findAll();
    }
}
