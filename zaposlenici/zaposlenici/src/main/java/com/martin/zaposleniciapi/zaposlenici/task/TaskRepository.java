package com.martin.zaposleniciapi.zaposlenici.task;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by i.mihalina on 7.6.2017..
 */
@Repository
public interface TaskRepository extends CrudRepository<Task,Integer> {
        public List<Task> findByEmployeeId(Integer Id);
}
