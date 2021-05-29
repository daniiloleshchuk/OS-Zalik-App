package com.lab6.domain.implementation;

import com.lab6.domain.IGeneralModel;

import javax.persistence.*;

@Entity
@Table(name = "Initiating_employee", schema = "oleshchuk_db", catalog = "")
public class InitiatingEmployee implements IGeneralModel {
    private Integer id;
    private Employee employeeByEmployeeId;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InitiatingEmployee that = (InitiatingEmployee) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id", nullable = false)
    public Employee getEmployeeByEmployeeId() {
        return employeeByEmployeeId;
    }

    public void setEmployeeByEmployeeId(Employee employeeByEmployeeId) {
        this.employeeByEmployeeId = employeeByEmployeeId;
    }

    @Override
    public String toString() {
        return "InitiatingEmployee{" +
                "id=" + id +
                ", employeeByEmployeeId=" + employeeByEmployeeId +
                '}';
    }
}
