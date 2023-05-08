package org.javacoders.repository;

import org.javacoders.entity.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer>{

}
