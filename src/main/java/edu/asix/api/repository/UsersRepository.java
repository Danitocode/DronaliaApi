package edu.asix.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import edu.asix.api.entity.User;

public interface UsersRepository extends JpaRepository<User, Integer> {

}
