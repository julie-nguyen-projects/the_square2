package com.the_square2.Service.Impl;

import com.the_square2.Model.View.UsersWithAtLeastOneCommonPoint;
import com.the_square2.Repository.UsersWithAtLeastOneCommonPointRepository;
import com.the_square2.Service.UsersWithAtLeastOneCommonPointService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service(value = "usersWithAtLeastOneCommonPointService")
@Transactional
public class UsersWithAtLeastOneCommonPointServiceImpl implements UsersWithAtLeastOneCommonPointService {

    @Resource
    private final UsersWithAtLeastOneCommonPointRepository usersWithAtLeastOneCommonPointRepository;

    public UsersWithAtLeastOneCommonPointServiceImpl(UsersWithAtLeastOneCommonPointRepository usersWithAtLeastOneCommonPointRepository) {
        this.usersWithAtLeastOneCommonPointRepository = usersWithAtLeastOneCommonPointRepository;
    }

    @Override
    public List<UsersWithAtLeastOneCommonPoint> getAll() {
        return this.usersWithAtLeastOneCommonPointRepository.findAll();
    }
}
