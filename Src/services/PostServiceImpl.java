package services;

import data.model.Post;
import data.repository.PostRepoImpl;

public class PostServiceImpl implements PostServices{
    PostRepoImpl repo = new PostRepoImpl();

    @Override
    public Post addPost(String title, String content) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        if(!titleExists(title)) {
            repo.save(post);
        }
        return post;
    }

    public Boolean titleExists(String title){
        for(Post post : repo.findAll()){
            if(title.equals(post.getTitle())){
                return true;
            }
        }
        return false;
    }

    @Override
    public Post findPostById(int id) {
        return repo.findById(id);
    }

    public int count(){
        return repo.count();
    }
}
