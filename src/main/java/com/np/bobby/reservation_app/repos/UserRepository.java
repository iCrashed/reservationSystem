package com.np.bobby.reservation_app.repos;

import com.np.bobby.reservation_app.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
