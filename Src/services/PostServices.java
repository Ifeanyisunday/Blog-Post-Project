package services;

import data.model.Post;

public interface PostServices {
    Post addPost(String title, String content);
    Post findPostById(int id);
    int count();
}
