package serviceTests;

import model.Facebook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import service.FacebookDao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static junit.framework.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacebookDaoTests {

    FacebookDao facebookDao;

    @Test
    public void shouldfindById(String id) {
        try {
            assertTrue(facebookDao.findById("1").getId().equals("1"));
            assertTrue(facebookDao.findById("1").getBirthday() == 401280850089L);
        } catch (FacebookDao.NotFoundException notFoundException) {
            notFoundException.getMessage();
        }
    }

    @Test
    public void shouldNotfindById(String id){
        try {
            assertTrue(facebookDao.findById("152fds").getId().equals("1"));
        } catch (FacebookDao.NotFoundException notFoundException) {
            notFoundException.getMessage();
        }
    }

    @Test
    public void shouldFindMostCommonWords() {
        Map<String, Long> mostCommonWords = new HashMap<String, Long>();
    }

    @Test
    public void shouldFindPostIdsByKeyword() {
        Set<String> mostCommonWords = new TreeSet<String>();
    }

    @Test
    public void shouldFindAll() {
        Set<Facebook> allFacebook = new TreeSet<Facebook>();
    }
}