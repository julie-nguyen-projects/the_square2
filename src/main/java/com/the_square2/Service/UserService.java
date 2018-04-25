package com.the_square2.Service;

import com.the_square2.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User createUser(User user);

    User getUserById(Long id);

    User updateUser(User user);
}
