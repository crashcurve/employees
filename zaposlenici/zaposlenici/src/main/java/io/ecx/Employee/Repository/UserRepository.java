package io.ecx.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.ecx.Employee.Model.User;

/**
 * Created by Martin on 6/15/2017.
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer>
{
    User findByEmail(String email);
}
