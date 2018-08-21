package com.citrusisgood.citrus.repository;

import com.citrusisgood.citrus.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<UserLogin, Long> {

    UserLogin findByUsername(String username);
}
