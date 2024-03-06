package com.deepak.JWT_Authentication.Repository;

import com.deepak.JWT_Authentication.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {


    Optional<User> findByUsername(String username);
}
