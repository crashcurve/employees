package com.martin.zaposleniciapi.zaposlenici.Data;

import com.martin.zaposleniciapi.zaposlenici.Model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Martin on 6/6/2017.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
        List<Employee> findByLastNameStartingWith(String name);
}
