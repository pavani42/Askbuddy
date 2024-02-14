package com.hcl.ask_buddy.question.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.ask_buddy.question.entity.User;

// User Repository
@Repository
public interface UserRepo extends JpaRepository<User, String>{

	Optional<User> findById(String id);

	User getByMail(String username);
	

}
