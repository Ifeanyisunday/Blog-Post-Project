package data.repository;

import data.model.Comment;
import data.model.Post;

import java.util.ArrayList;
import java.util.List;

public class CommentRepoImpl implements CommentRepo{

    private List<Comment> comments = new ArrayList<>();

    @Override
    public Comment findById(int id) {
        for(Comment comment : comments){
            if(comment.getId() == id){
                return comment;
            }
        }
        return null;
    }

    @Override
    public List<Comment> findAll() {
        return comments;
    }

    @Override
    public Comment save(Comment comment) {
        comments.add(comment);
        comment.setId(generateCommentId());
        return comment;
    }

    private int generateCommentId(){
        return count() * 2;
    }

    @Override
    public void deleteAll() {
        comments.clear();
    }

    @Override
    public void deleteById(int id) {
        comments.remove(findById(id));
    }

    @Override
    public boolean isEmpty() {
        return comments.isEmpty();
    }

    @Override
    public int count() {
        return comments.size();
    }
}
