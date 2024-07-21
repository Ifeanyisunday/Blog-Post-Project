import data.model.Comment;
import data.repository.CommentRepoImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommentRepoImplTest {

    CommentRepoImpl comRepo;
    @BeforeEach
    void setRepo(){
        comRepo = new CommentRepoImpl();
    }

    @Test
    void testSava(){
        Comment com1 = new Comment();
        Comment com2 = new Comment();
        comRepo.save(com1);
        comRepo.save(com2);
        assertEquals(2, comRepo.count());
    }

    @Test
    void testFindById(){
        Comment com1 = new Comment();
        Comment com2 = new Comment();
        comRepo.save(com1);
        comRepo.save(com2);
        assertEquals(com2, comRepo.findById(4));
    }

    @Test
    void testFindAAll(){
        Comment com1 = new Comment();
        Comment com2 = new Comment();
        comRepo.save(com1);
        comRepo.save(com2);
        assertEquals(comRepo.findAll(), comRepo.findAll());
    }

    @Test
    void testDeleteAAll(){
        Comment com1 = new Comment();
        Comment com2 = new Comment();
        comRepo.save(com1);
        comRepo.save(com2);
        comRepo.deleteAll();
        assertEquals(0, comRepo.count());
    }

    @Test
    void testDeleteById(){
        Comment com1 = new Comment();
        Comment com2 = new Comment();
        comRepo.save(com1);
        comRepo.save(com2);
        comRepo.deleteById(4);
        assertEquals(1, comRepo.count());
    }

    @Test
    void testIsEmpty(){
        Comment com1 = new Comment();
        Comment com2 = new Comment();
        comRepo.save(com1);
        comRepo.save(com2);
        comRepo.deleteAll();
        assertTrue(comRepo.isEmpty());
    }

}

