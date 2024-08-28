package com.alexissimmons.controller;

import java.util.List;

import com.alexissimmons.car_maintenance.entity.MaintenanceRecord;

public interface ResponseEntity<T> {

    static ResponseEntity<List<MaintenanceRecord>> ok(List<MaintenanceRecord> records) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ok'");
    }

    static Object notFound() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notFound'");
    }

}
