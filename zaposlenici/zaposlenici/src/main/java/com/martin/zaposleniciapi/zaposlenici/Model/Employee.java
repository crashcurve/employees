package com.martin.zaposleniciapi.zaposlenici.Model;

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
    private String position;
    private String startingDate;
    private Integer salary;
    private String lastSalaryRaise;
    private String address;
    private Integer telephone;
    private String email;
    private String notes;


    public Employee(Integer id,String name, String position, String startingDate, Integer salary, String lastSalaryRaise, String address, Integer telephone, String email, String notes) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.startingDate = startingDate;
        this.salary = salary;
        this.lastSalaryRaise = lastSalaryRaise;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.notes = notes;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getLastSalaryRaise() {
        return lastSalaryRaise;
    }

    public void setLastSalaryRaise(String lastSalaryRaise) {
        this.lastSalaryRaise = lastSalaryRaise;
    }



    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }





    public Employee(){

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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", startingDate='" + startingDate + '\'' +
                ", salary=" + salary +
                ", lastSalaryRaise='" + lastSalaryRaise + '\'' +
                ", address='" + address + '\'' +
                ", telephone=" + telephone +
                ", email='" + email + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
