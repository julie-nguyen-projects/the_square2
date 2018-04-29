package com.the_square2.Repository;

import com.the_square2.Model.View.UsersWithAtLeastOneCommonPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersWithAtLeastOneCommonPointRepository extends JpaRepository<UsersWithAtLeastOneCommonPoint, Long> {
}
