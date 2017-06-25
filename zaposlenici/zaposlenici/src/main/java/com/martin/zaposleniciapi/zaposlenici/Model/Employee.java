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
    private Integer oib;
    private String position;
    private String startingDate;
    private String endingDate;
    private Integer salary;
    private String lastSalaryRaise;
    private String address;
    private Integer telephone;
    private String email;
    private String notes;

    public Employee(){

    }

    
}
