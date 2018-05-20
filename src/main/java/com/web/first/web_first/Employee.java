package com.web.first.web_first;

import javax.persistence.*;

@Entity
@Table(name = "User")
    public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "imie")
    private String imie;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                '}';
    }
}

