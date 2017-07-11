package io.ecx.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by i.mihalina on 13.6.2017..
 */
@Entity
@Table(name = "role")
public class Role
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;
    @Column(name = "role")
    private String role;

    public int getId()
    {
        return id;
    }

    public String getRole()
    {
        return role;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setRole(String role)
    {
        this.role = role;
    }

}
