package data.repository;

import data.model.Post;

import java.util.ArrayList;
import java.util.List;

public class PostRepoImpl implements PostRepo{

    List<Post> posts = new ArrayList<>();

    @Override
    public Post findById(int id) {
        for(Post post : posts){
            if(post.getId() == id){
                return post;
            }
        }
        return null;
    }

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post save(Post post) {
        posts.add(post);
        post.setId(generatePostId());
        return post;
    }

    public int generatePostId(){
        return count() + 1;
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById() {

    }

    @Override
    public int count() {
        return posts.size();
    }

    @Override
    public String toString() {
        return "" +
                posts +
                "";
    }

    /**public static void main(String... args){
        PostRepoImpl post = new PostRepoImpl();
        Post post1 = new Post();
        post.save(post1);
        System.out.print(post.toString());
    }**/
}
