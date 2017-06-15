package com.martin.zaposleniciapi.zaposlenici.Data;

import com.martin.zaposleniciapi.zaposlenici.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by i.mihalina on 13.6.2017..
 */

public interface RoleRepository extends JpaRepository<Role, Integer>{
        
}
