package com.learningstuff.userservice.services;

import com.learningstuff.userservice.models.User;
import com.learningstuff.userservice.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ১৪/১২/২১
 * Time: ৫:০৫ PM
 * Email: mdshamim723@gmail.com
 */

@AllArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public User findById(long id) {
        return userRepository.findById(id).orElse(null);
    }

}
