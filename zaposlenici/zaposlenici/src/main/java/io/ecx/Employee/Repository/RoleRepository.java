package io.ecx.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.ecx.Employee.Model.Role;

/**
 * Created by Martin on 6/15/2017.
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>
{
    Role findByRole(String role);
}
