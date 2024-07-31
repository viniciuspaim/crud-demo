package com.viniciuspaim.crud_demo.repositories;

import com.viniciuspaim.crud_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
