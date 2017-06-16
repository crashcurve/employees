package com.martin.zaposleniciapi.zaposlenici.Security.Data;

import com.martin.zaposleniciapi.zaposlenici.Security.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Martin on 6/15/2017.
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByRole(String role);
}
