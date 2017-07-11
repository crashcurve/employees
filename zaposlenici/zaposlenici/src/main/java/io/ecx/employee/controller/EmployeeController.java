package io.ecx.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.ecx.employee.model.Employee;
import io.ecx.employee.repository.EmployeeRepository;

/**
 * Created by Martin on 6/6/2017.
 */
@Controller
public class EmployeeController
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public String addEmployee(Employee employee)
    {
        employeeRepository.save(employee);
        return "redirect:/employees";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employees/add")
    public String addEmployee(Model model)
    {
        model.addAttribute("employee", new Employee());
        return "EditEmployee";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employees/delete/{id}")
    public String deleteEmployee(@PathVariable Integer id)
    {
        employeeRepository.delete(id);
        return "redirect:/employees";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employees/{id}/edit")
    public String editEmployee(@PathVariable Integer id, Model model)
    {
        model.addAttribute("employee", employeeRepository.findOne(id));
        return "EditEmployee";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public String getAllEmployees(Model model)
    {
        model.addAttribute("employees", employeeRepository.findAll());
        return "EmployeesView";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employees/{id}")
    public String getEmployee(@PathVariable Integer id, Model model)
    {
        model.addAttribute("employee", employeeRepository.findOne(id));
        return "ViewEmployee";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employees/filter")
    public String getFilteredEmployees(Model model, @RequestParam String name)
    {
        model.addAttribute("employees", employeeRepository.findByLastNameStartingWith(name));
        return "EmployeesView";
    }

}
