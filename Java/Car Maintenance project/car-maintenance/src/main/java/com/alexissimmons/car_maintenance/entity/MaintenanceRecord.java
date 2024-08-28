package com.alexissimmons.car_maintenance.entity;



public class MaintenanceRecord {
   
    private String car_vin;
    private String details;
    private String date;
    private String cost;
    private String status;

    @ManyToOne
    @JoinColumn(name = "car_vin") // This specifies the foreign key column name in the database
    private Car car;

    public MaintenanceRecord() {} //Default constructor
//Getter & Setter
    public String getcarVin() {
        return car_vin;
    }

    public void setcarVin(String car_vin) {
        this.car_vin = car_vin;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date ) {
        this.date = date;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
