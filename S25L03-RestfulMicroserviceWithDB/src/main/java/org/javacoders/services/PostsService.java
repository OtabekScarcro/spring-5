package org.javacoders.services;

import java.util.ArrayList;
import java.util.List;

import org.javacoders.entity.Post;
import org.javacoders.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PostsService {
	
	@Autowired
	private PostRepository repo;
	
	public List<Post> getPosts(){
		List<Post> list = new ArrayList<>();
		for(Post post: repo.findAll()) {
			list.add(post);
		}
		return list;
	}

	public Post getPost(int id) {
		return repo.findById(id).get();
	}

	public void addPost(Post newPost) {
		repo.save(newPost);
	}

	public void updatePost(Post post) {
		repo.save(post);
	}

	public void deletePost(int id) {
		repo.deleteById(id);
	}
}

















