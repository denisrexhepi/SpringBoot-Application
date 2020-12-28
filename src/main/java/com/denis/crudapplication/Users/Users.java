package com.denis.crudapplication.Users;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.persistence.*;

@Entity
@Table(name="Users")
public class Users {

    @Id
    @Column(name ="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public int  id;
    @Column(name ="name")
    public String name;
    @Column(name ="last_name")
    public String lastName;
    @Column(name ="degree_major")
    public String degreeMajor;

    public Users() {

    }

    public Users(int id, String name, String lastName, String degreeMajor) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.degreeMajor = degreeMajor;
    }

    public String getDegreeMajor() {
        return degreeMajor;
    }

    public void setDegreeMajor(String degreeMajor) {
        this.degreeMajor = degreeMajor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
