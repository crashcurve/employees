package com.martin.zaposleniciapi.zaposlenici.employee;

import com.martin.zaposleniciapi.zaposlenici.task.Task;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Martin on 6/6/2017.
 */
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String notes;

    public Employee(){

    }



    public Employee(Integer id, String name, String notes) {
        this.id = id;
        this.name = name;
        this.notes = notes;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
