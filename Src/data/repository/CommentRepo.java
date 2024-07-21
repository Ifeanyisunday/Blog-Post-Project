package data.repository;


import data.model.Comment;

import java.util.List;

public interface CommentRepo {
    Comment findById(int id);
    List<Comment> findAll();
    Comment save(Comment comment);
    void deleteAll();
    void deleteById(int id);
    boolean isEmpty();
    int count();
}
