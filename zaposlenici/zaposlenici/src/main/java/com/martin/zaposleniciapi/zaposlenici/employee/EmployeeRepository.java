package com.martin.zaposleniciapi.zaposlenici.employee;

import com.martin.zaposleniciapi.zaposlenici.task.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Martin on 6/6/2017.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
