package com.the_square2.Web.Rest;

import com.the_square2.Model.View.FriendsOfFriends;
import com.the_square2.Service.Impl.FriendsOfFriendsServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vue.html/friends-friends")
public class FriendsOfFriendsResource {

    private final FriendsOfFriendsServiceImpl friendsService;

    public FriendsOfFriendsResource(FriendsOfFriendsServiceImpl friendsService) {
        this.friendsService = friendsService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<FriendsOfFriends> getAllFriendsOfFriends() {
        return friendsService.getAll();
    }
}
