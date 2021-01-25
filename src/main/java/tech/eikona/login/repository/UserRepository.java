package tech.eikona.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.eikona.login.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);
	
	

}