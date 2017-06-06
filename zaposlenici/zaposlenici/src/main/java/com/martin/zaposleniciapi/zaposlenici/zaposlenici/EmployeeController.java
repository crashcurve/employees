package com.martin.zaposleniciapi.zaposlenici.zaposlenici;

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

    @GetMapping(path="/employees")
    public @ResponseBody List<Employee> getAllEmployees(){
        List<Employee> lista = new ArrayList<>();
        employeeRepository.findAll().forEach(lista::add);
        return lista;
    }

    @GetMapping(path="/add")
    public @ResponseBody  String addNewEmployee (@RequestParam String name, @RequestParam String notes) {
        Employee employee = new Employee();
        employee.setName(name);
        employee.setNotes(notes);
        employeeRepository.save(employee);
        return "Saved";
    }


}
