package com.alexissimmons.car_maintenance.entity;

import com.alexissimmons.car_maintenance.Column;
import com.alexissimmons.car_maintenance.Entity;
import com.alexissimmons.car_maintenance.Table;





@Entity //Marks the class as a JPA entity, allowing it to map to a database table.
@Table(name = "car_info")

public class Car {
    
    @Id //Identifies vin as primary key
    @Column(name = "vin", nullable = false, length = 17) //Specifies details of column mapped to the database
    private String vin; 

    @Column(name = "customer_name", nullable = false, length = 100)
    private String customer_name;

    @Column(name = "model", nullable = false, length = 100)
    private String model;
    
    @Column(name = "manufacturer", nullable = false, length = 100)
    private String manufacturer;

    @Column(name = "discount", nullable = false, length = 10)
    private String discount;

//Default Constructor
    public Car() {}
    
//Parameter Constructor 
    public Car(String vin, String customer_name, String model, String manufacturer, String discount) {
        this.vin = vin;
        this.customer_name = customer_name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.discount = discount;
    }

//Getter & Setter Methods 
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCustomerName() {
        return customer_name;
    }

    public void setCustomerName(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getModel () {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}


