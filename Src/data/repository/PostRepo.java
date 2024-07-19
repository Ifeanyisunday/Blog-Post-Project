package data.repository;

import data.model.Post;

import java.util.List;

public interface PostRepo {

    Post findById(int id);
    List<Post> findAll();
    Post save(Post post);
    void deleteAll();
    void deleteById();
    int count();
}
