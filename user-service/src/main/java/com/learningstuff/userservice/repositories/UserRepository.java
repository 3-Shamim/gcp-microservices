package com.learningstuff.userservice.repositories;

import com.learningstuff.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ১৪/১২/২১
 * Time: ৫:০৫ PM
 * Email: mdshamim723@gmail.com
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
