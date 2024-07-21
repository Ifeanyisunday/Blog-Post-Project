package web;

import data.model.Post;
import services.PostServiceImpl;

public class PostController {

    PostServiceImpl postService = new PostServiceImpl();

    public String createPost(String title, String content){
        return postService.addPost(title, content).toString();
    }

    public Post getPost(int id){
        return postService.findPostById(id);
    }

    public int count(){
        return postService.count();
    }

    public static void main(String... args) {
        PostController con = new PostController();
        System.out.print(con.createPost("news", "smart"));
        System.out.print(con.createPost("football", "gee"));
        String result = con.getPost(2).toString();
        System.out.print(result);
    }
}
