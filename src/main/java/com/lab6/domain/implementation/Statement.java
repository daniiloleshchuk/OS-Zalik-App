package com.lab6.domain.implementation;

import com.lab6.domain.IGeneralModel;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Statement implements IGeneralModel {
    private Integer id;
    private String description;
    private Timestamp creationDate;
    private InitiatingEmployee initiatingEmployeeByInitiatingEmployeeId;
    private ResponsibleEmployee responsibleEmployeeByResponsibleEmployeeId;
    private EquipmentLocation equipmentLocationByEquipmentLocationId;
    private Status statusByStatusId;
    private Priority priorityByPriorityId;
    private TypeOfStatement typeOfStatementByTypeOfStatementId;

    public Statement() {
        java.util.Date dt = new java.util.Date();
        this.creationDate = new Timestamp(dt.getTime());
    }

    @ManyToOne
    @JoinColumn(name = "responsible_employee_id", referencedColumnName = "id", nullable = false)
    public ResponsibleEmployee getResponsibleEmployeeByResponsibleEmployeeId() {
        return responsibleEmployeeByResponsibleEmployeeId;
    }

    public void setResponsibleEmployeeByResponsibleEmployeeId(ResponsibleEmployee responsibleEmployeeByResponsibleEmployeeId) {
        this.responsibleEmployeeByResponsibleEmployeeId = responsibleEmployeeByResponsibleEmployeeId;
    }

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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "creation_date")
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Statement statement = (Statement) o;

        if (id != null ? !id.equals(statement.id) : statement.id != null) return false;
        if (description != null ? !description.equals(statement.description) : statement.description != null)
            return false;
        if (creationDate != null ? !creationDate.equals(statement.creationDate) : statement.creationDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "initiating_employee_id", referencedColumnName = "id", nullable = false)
    public InitiatingEmployee getInitiatingEmployeeByInitiatingEmployeeId() {
        return initiatingEmployeeByInitiatingEmployeeId;
    }

    public void setInitiatingEmployeeByInitiatingEmployeeId(InitiatingEmployee initiatingEmployeeByInitiatingEmployeeId) {
        this.initiatingEmployeeByInitiatingEmployeeId = initiatingEmployeeByInitiatingEmployeeId;
    }

    @ManyToOne
    @JoinColumn(name = "equipment_location_id", referencedColumnName = "id", nullable = false)
    public EquipmentLocation getEquipmentLocationByEquipmentLocationId() {
        return equipmentLocationByEquipmentLocationId;
    }

    public void setEquipmentLocationByEquipmentLocationId(EquipmentLocation equipmentLocationByEquipmentLocationId) {
        this.equipmentLocationByEquipmentLocationId = equipmentLocationByEquipmentLocationId;
    }

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id", nullable = false)
    public Status getStatusByStatusId() {
        return statusByStatusId;
    }

    public void setStatusByStatusId(Status statusByStatusId) {
        this.statusByStatusId = statusByStatusId;
    }

    @ManyToOne
    @JoinColumn(name = "priority_id", referencedColumnName = "id", nullable = false)
    public Priority getPriorityByPriorityId() {
        return priorityByPriorityId;
    }

    public void setPriorityByPriorityId(Priority priorityByPriorityId) {
        this.priorityByPriorityId = priorityByPriorityId;
    }

    @ManyToOne
    @JoinColumn(name = "type_of_statement_id", referencedColumnName = "id", nullable = false)
    public TypeOfStatement getTypeOfStatementByTypeOfStatementId() {
        return typeOfStatementByTypeOfStatementId;
    }

    public void setTypeOfStatementByTypeOfStatementId(TypeOfStatement typeOfStatementByTypeOfStatementId) {
        this.typeOfStatementByTypeOfStatementId = typeOfStatementByTypeOfStatementId;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                ", initiatingEmployeeByInitiatingEmployeeId=" + initiatingEmployeeByInitiatingEmployeeId +
                ", equipmentLocationByEquipmentLocationId=" + equipmentLocationByEquipmentLocationId +
                ", statusByStatusId=" + statusByStatusId +
                ", priorityByPriorityId=" + priorityByPriorityId +
                ", typeOfStatementByTypeOfStatementId=" + typeOfStatementByTypeOfStatementId +
                '}';
    }
}
