package com.martin.zaposleniciapi.zaposlenici.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by i.mihalina on 13.6.2017..
 */
@Entity
public class Role {
    @Id
    @GeneratedValue
    private int roleId;
    private String roleName;
    private boolean active;


    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @ManyToMany(mappedBy="roles")
    private List<User> users = new ArrayList<User>();
}
