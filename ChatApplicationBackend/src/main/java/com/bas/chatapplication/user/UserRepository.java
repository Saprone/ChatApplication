package com.bas.chatapplication.user;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
