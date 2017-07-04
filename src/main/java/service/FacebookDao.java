package service;

import model.Facebook;
import repositories.FacebookService;

import java.util.Map;
import java.util.Set;

/**
 * Created by Pawel_D on 2017-07-04.
 */
public class FacebookDao implements FacebookService {

    public Facebook findById(String id) throws NotFoundException {
        return null;
    }

    public Map<String, Long> findMostCommonWords() {
        return null;
    }

    public Set<String> findPostIdsByKeyword(String word) {
        return null;
    }

    public Set<Facebook> findAll() {
        return null;
    }

    public class NotFoundException extends Exception {

        public NotFoundException(String message) {
            super(message);
        }
    }
}