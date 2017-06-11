package com.martin.zaposleniciapi.zaposlenici.Controller;

import com.martin.zaposleniciapi.zaposlenici.Model.Employee;
import com.martin.zaposleniciapi.zaposlenici.Model.Task;
import com.martin.zaposleniciapi.zaposlenici.Data.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i.mihalina on 7.6.2017..
 */@Controller
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;


    @RequestMapping(method= RequestMethod.GET, value="/employees/{employeeId}/tasks")
    public String getAllTasks(@PathVariable Integer employeeId, Model model){
        model.addAttribute("tasks" , taskRepository.findByEmployeeId(employeeId));
        return "TasksView";
    }

    @RequestMapping(method=RequestMethod.GET, value="/employees/{employeeId}/tasks/{id}")
     public  @ResponseBody Task getTask(@PathVariable Integer id){
        return taskRepository.findOne(id);
    }

    @RequestMapping(method=RequestMethod.POST, value="/employees/{employeeId}/tasks")
    public @ResponseBody void addTask (@RequestBody Task task, @PathVariable Integer employeeId) {
        task.setEmployee(new Employee(employeeId, "", ""));
        taskRepository.save(task);
    }

    @RequestMapping(method=RequestMethod.PUT, value="employees/{employeeId}/tasks/{id}")
    public @ResponseBody void updateTask(@RequestBody Task task,@PathVariable Integer employeeId, @PathVariable Integer id){
        task.setEmployee(new Employee(employeeId, "", ""));
        taskRepository.save(task);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="employees/{employeeId}/tasks/{id}")
    public @ResponseBody void deleteTask(@PathVariable Integer id){
        taskRepository.delete(id);
    }



}
