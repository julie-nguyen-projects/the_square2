package com.the_square2.Web.Rest;

import com.the_square2.Model.View.UsersWithAtLeastOneCommonPoint;
import com.the_square2.Service.Impl.UsersWithAtLeastOneCommonPointServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/vue.html/users-common-point")
public class UsersWithAtLeastOneCommonPointResource {

    private final UsersWithAtLeastOneCommonPointServiceImpl usersWithAtLeastOneCommonPointService;

    public UsersWithAtLeastOneCommonPointResource(UsersWithAtLeastOneCommonPointServiceImpl userCommonPointService) {
        this.usersWithAtLeastOneCommonPointService = userCommonPointService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<UsersWithAtLeastOneCommonPoint> getAllUsersWithCommonPoints() {
        List<UsersWithAtLeastOneCommonPoint> users = usersWithAtLeastOneCommonPointService.getAll();
        System.out.println(users);
        return users;
    }
}
