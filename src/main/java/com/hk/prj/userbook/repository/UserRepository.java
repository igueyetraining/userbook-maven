package com.hk.prj.userbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hk.prj.userbook.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
