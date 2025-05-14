package com.rahul.restfulWebServices.socialMedia.repositories;

import com.rahul.restfulWebServices.socialMedia.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
