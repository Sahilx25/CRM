package com.freak.CRM.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.freak.CRM.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
