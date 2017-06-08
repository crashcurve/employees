package com.martin.zaposleniciapi.zaposlenici.Controller;

import com.martin.zaposleniciapi.zaposlenici.Data.EmployeeRepository;
import com.martin.zaposleniciapi.zaposlenici.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Martin on 6/6/2017.
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method=RequestMethod.GET, value="/employees")
    public @ResponseBody List<Employee> getAllEmployees(){
        List<Employee> lista = new ArrayList<>();
        employeeRepository.findAll().forEach(lista::add);
        return lista;
    }

    @RequestMapping(method=RequestMethod.GET, value="/employees/{id}")
    public  @ResponseBody Employee getEmployee(@PathVariable Integer id){
        return employeeRepository.findOne(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/employees")
    public @ResponseBody  void addEmployee (@RequestBody Employee employee) {
        employeeRepository.save(employee);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
    public @ResponseBody void updateTask(@RequestBody Employee employee, @PathVariable Integer id){
        employeeRepository.save(employee);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
    public @ResponseBody void deleteEmployee(@PathVariable Integer id){
        employeeRepository.delete(id);
    }



}
