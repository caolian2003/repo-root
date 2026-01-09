package com.learn.securitytest.backend.repository;

import com.learn.securitytest.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
