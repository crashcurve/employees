package com.martin.zaposleniciapi.zaposlenici.Data;

import com.martin.zaposleniciapi.zaposlenici.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Martin on 6/15/2017.
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
