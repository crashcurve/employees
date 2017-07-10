package io.ecx.Employee.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.ecx.Employee.Model.Employee;

/**
 * Created by Martin on 6/6/2017.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
    List<Employee> findByLastNameStartingWith(String name);
}
