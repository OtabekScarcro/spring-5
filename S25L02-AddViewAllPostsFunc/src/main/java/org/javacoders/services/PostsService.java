package org.javacoders.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.javacoders.entity.Post;

public class PostsService {
	static List<Post> posts = new ArrayList<>(
			Arrays.asList(
					new Post(1, "DataType", "Sample text"),
					new Post(2, "Classes", "Sample text"),
					new Post(3, "Arguments", "Sample text"),
					new Post(4, "Changes", "Sample text"),
					new Post(5, "Anything Else", "Sample text")
			));
	
	public List<Post> getPosts(){
		return posts;
	}

	public Post getPost(int id) {
		for(Post post: posts) {
			if(post.getPostId() == id) {
				return post;
			}
		}
		return null;
	}

	public void addPost(Post newPost) {
		posts.add(newPost);
	}

	public void updatePost(Post post, int id) {
		for(int i=0;i<posts.size();i++) {
			Post tm = posts.get(i);
			if(tm.getPostId() == id) {
				posts.set(i, post);
				return;
			}
		}
	}

	public void deletePost(int id) {
		for(int i=0;i<posts.size();i++) {
			Post tm = posts.get(i);
			if(tm.getPostId() == id) {
				posts.remove(i);
				return;
			}
		}
	}
}

















