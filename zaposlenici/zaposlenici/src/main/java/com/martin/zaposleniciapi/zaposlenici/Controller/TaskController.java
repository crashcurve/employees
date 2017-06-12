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
     public String getTask(@PathVariable Integer id,Model model){
        model.addAttribute("task",taskRepository.findOne(id));
        return "ViewTask";
    }

    @RequestMapping(method=RequestMethod.GET, value="/employees/{employeeId}/tasks/add")
    public String addTask(Model model, @PathVariable Integer employeeId){
        Task task = new Task();
        task.setEmployee(new Employee(employeeId, "", ""));
        model.addAttribute("task", task);
        return "ViewTask";
    }

    @RequestMapping(method=RequestMethod.POST, value="/employees/{employeeId}/tasks")
    public String addTask (Task task, @PathVariable Integer employeeId) {
        task.setEmployee(new Employee(employeeId, "", ""));
        taskRepository.save(task);
        return "redirect:/employees";
    }

    @RequestMapping(method=RequestMethod.GET, value="employees/{employeeId}/tasks/{id}/delete")
    public String  deleteTask(@PathVariable Integer id){
        taskRepository.delete(id);
        return "redirect:/employees";
    }



}
