import data.model.Post;
import org.junit.jupiter.api.*;
import services.PostServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class PostServiceTest {

    PostServiceImpl postService;

    @BeforeEach
    void setBefore(){
        postService = new PostServiceImpl();
    }

    @Test
    void testAddPost(){
        postService.addPost("football", "food");
        postService.addPost("news", "feild");
        assertEquals(2, postService.count());

    }

    @Test
    void testFindById(){
        Post post1 = postService.addPost("football", "food");
        Post post2 = postService.addPost("news", "feild");
        assertEquals(post1, postService.findPostById(2));
    }

    @Test
    void testIfTitleExists(){
        Post post1 = postService.addPost("football", "food");
        Post post2 = postService.addPost("news", "feild");
        assertTrue(postService.titleExists("football"));
    }

}
