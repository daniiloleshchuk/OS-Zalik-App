package com.lab6.domain.implementation;

import com.lab6.domain.IGeneralModel;

import javax.persistence.*;

@Entity
public class Employee implements IGeneralModel {
    private Integer id;
    private String name;
    private String surname;
    private WorkingPosition workingPositionByWorkingPositionId;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @ManyToOne
    @JoinColumn(name = "working_position_id", referencedColumnName = "id", nullable = false)
    public WorkingPosition getWorkingPositionByWorkingPositionId() {
        return workingPositionByWorkingPositionId;
    }

    public void setWorkingPositionByWorkingPositionId(WorkingPosition workingPositionByWorkingPositionId) {
        this.workingPositionByWorkingPositionId = workingPositionByWorkingPositionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != null ? !id.equals(employee.id) : employee.id != null) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        if (surname != null ? !surname.equals(employee.surname) : employee.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
