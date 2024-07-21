import data.model.Post;
import org.junit.jupiter.api.*;
import services.PostServiceImpl;
import web.PostController;

import static org.junit.jupiter.api.Assertions.*;

public class PostControllerTest {

    PostController postCon;
    @BeforeEach
    void setBefore(){
        postCon = new PostController();
    }

    @Test
    void testCreatePost(){
       postCon.createPost("news", "world");
       postCon.createPost("valid", "play");
       assertEquals(2, postCon.count());
    }

    @Test
    void testGetPost(){
        postCon.createPost("news", "world");
        postCon.createPost("valid", "play");
        assertEquals(postCon.getPost(3), postCon.getPost(3));
    }
}
