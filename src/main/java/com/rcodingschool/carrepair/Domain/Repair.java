package com.rcodingschool.carrepair.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
//import java.time.LocalDate;
//import java.time.LocalTime;
import java.util.Date;

@Entity(name = "Repairs")
public class Repair implements Serializable {

    @Id
    @Column(name = "RepairID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long repairID;

    @Column(name = "RepairDate" /*, nullable = false*/)
    private Date repairDate;

    @Column(name = "RepairTime")
    private Time repairTime;

    @Column(name = "RepairStatus", nullable = false)
    private String repairStatus;

    @Column(name = "RepairTasks", nullable = false)
    private String repairTasks;

    @Column(name = "RepairTotalCost" /*nullable = false */)
    private Float repairTotalCost;

    @Column(name = "RepairTypeID", nullable = false)
    private Short repairTypeID;

    @ManyToOne(optional=false)
    @JoinColumn(name="RepairTypeID",referencedColumnName="RepairTypeID", updatable = false, insertable = false)
    private RepairType repairType;

    @Column(name = "VehicleID", nullable = false)
    private String vehicleID;

    @ManyToOne(optional=false)
    @JoinColumn(name="VehicleID",referencedColumnName="VehicleID", updatable = false, insertable = false)
    private Vehicle vehicle;


    public Repair() {
    }

    public RepairType getRepairType() {
        return repairType;
    }

    public void setRepairType(RepairType repairType) {
        this.repairType = repairType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Repair(Long repairID, Date repairDate, Time repairTime, String repairStatus, String repairTasks,
                  Float repairTotalCost, Short repairTypeID, String vehicleID) {
        this.repairID = repairID;
        this.repairDate = repairDate;
        this.repairTime = repairTime;
        this.repairStatus = repairStatus;
        this.repairTasks = repairTasks;
        this.repairTotalCost = repairTotalCost;
        this.repairTypeID = repairTypeID;
        this.vehicleID = vehicleID;

    }

    public Long getRepairID() {
        return repairID;
    }

    public void setRepairID(Long repairID) {
        this.repairID = repairID;
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public Time getRepairTime() {
        return repairTime;
    }

    public void setRepairTime(Time repairTime) {
        this.repairTime = repairTime;
    }

    public String getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(String repairStatus) {
        this.repairStatus = repairStatus;
    }

    public String getRepairTasks() {
        return repairTasks;
    }

    public void setRepairTasks(String repairTasks) {
        this.repairTasks = repairTasks;
    }

    public Float getRepairTotalCost() {
        return repairTotalCost;
    }

    public void setRepairTotalCost(Float repairTotalCost) {
        this.repairTotalCost = repairTotalCost;
    }

    public Short getRepairTypeID() {
        return repairTypeID;
    }

    public void setRepairTypeID(Short repairTypeID) {
        this.repairTypeID = repairTypeID;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }
}