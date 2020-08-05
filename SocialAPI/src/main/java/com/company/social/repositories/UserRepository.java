package com.company.social.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.social.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	List<User> findByLocationId(Integer id);
}
