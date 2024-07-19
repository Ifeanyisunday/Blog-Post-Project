import data.model.Post;
import data.repository.PostRepoImpl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PostRepoImplTest {
    PostRepoImpl repo;
    @BeforeEach
    void setRepo(){
        repo = new PostRepoImpl();
    }

    @Test
    void testSava(){
        Post post1 = new Post();
        Post post2 = new Post();
        repo.save(post1);
        repo.save(post2);
        assertEquals(2, repo.count());
    }

    @Test
    void testFindById(){
        Post post1 = new Post();
        Post post2 = new Post();
        repo.save(post1);
        repo.save(post2);
        assertEquals(post1, repo.findById(2));
    }

    @Test
    void testFindAll(){
        Post post1 = new Post();
        Post post2 = new Post();
        repo.save(post1);
        repo.save(post2);
        assertEquals(post1, repo.findById(2));
    }
}
