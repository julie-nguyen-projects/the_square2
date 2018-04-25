package com.the_square2.Web.Rest;

import com.the_square2.Model.User;
import com.the_square2.Service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getAllUsers() {
        List<User> users = userService.getAll();
        System.out.println(users);
        return users;
    }

}
