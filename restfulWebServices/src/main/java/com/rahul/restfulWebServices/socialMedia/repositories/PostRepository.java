package com.rahul.restfulWebServices.socialMedia.repositories;

import com.rahul.restfulWebServices.socialMedia.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
