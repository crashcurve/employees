package com.martin.zaposleniciapi.zaposlenici.Data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

/**
 * Created by i.mihalina on 13.6.2017..
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
