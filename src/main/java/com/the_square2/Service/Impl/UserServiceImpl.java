package com.the_square2.Service.Impl;

import com.the_square2.Model.User;
import com.the_square2.Repository.UserRepository;
import com.the_square2.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
