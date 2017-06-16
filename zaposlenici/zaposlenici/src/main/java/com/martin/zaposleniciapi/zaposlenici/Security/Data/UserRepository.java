package com.martin.zaposleniciapi.zaposlenici.Security.Data;

import com.martin.zaposleniciapi.zaposlenici.Security.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Martin on 6/15/2017.
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
