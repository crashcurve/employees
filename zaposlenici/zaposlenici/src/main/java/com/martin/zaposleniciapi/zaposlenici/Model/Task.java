package com.martin.zaposleniciapi.zaposlenici.Model;

import com.martin.zaposleniciapi.zaposlenici.Model.Employee;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by i.mihalina on 7.6.2017..
 */
@Entity
public class Task implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @ManyToOne
    private Employee employee;

    public Task(){

    }

    public Task(Integer id, String name, String description, Integer employeeId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employee = new Employee(employeeId, "", "");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
