package com.martin.zaposleniciapi.zaposlenici.zaposlenici;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Martin on 6/6/2017.
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
