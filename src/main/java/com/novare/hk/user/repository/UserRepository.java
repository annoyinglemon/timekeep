package com.novare.hk.user.repository;

import com.novare.hk.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
		
		User findByUsername(String username);
}


