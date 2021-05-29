package com.lab6.domain.implementation;

import com.lab6.domain.IGeneralModel;

import javax.persistence.*;

@Entity
@Table(name = "equipment_location", schema = "oleshchuk_db")
public class EquipmentLocation implements IGeneralModel {
    private Integer id;
    private String office;
    private Integer roomNumber;
    private Integer workingPlaceNumber;

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
    @Column(name = "office")
    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Basic
    @Column(name = "room_number")
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Basic
    @Column(name = "working_place_number")
    public Integer getWorkingPlaceNumber() {
        return workingPlaceNumber;
    }

    public void setWorkingPlaceNumber(Integer workingPlaceNumber) {
        this.workingPlaceNumber = workingPlaceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquipmentLocation that = (EquipmentLocation) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (office != null ? !office.equals(that.office) : that.office != null) return false;
        if (roomNumber != null ? !roomNumber.equals(that.roomNumber) : that.roomNumber != null) return false;
        if (workingPlaceNumber != null ? !workingPlaceNumber.equals(that.workingPlaceNumber) : that.workingPlaceNumber != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (office != null ? office.hashCode() : 0);
        result = 31 * result + (roomNumber != null ? roomNumber.hashCode() : 0);
        result = 31 * result + (workingPlaceNumber != null ? workingPlaceNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EquipmentLocation{" +
                "id=" + id +
                ", office='" + office + '\'' +
                ", roomNumber=" + roomNumber +
                ", workingPlaceNumber=" + workingPlaceNumber +
                '}';
    }
}
