package com.alexissimmons.controller;
import com.alexissimmons.car_maintenance.entity.MaintenanceRecord;

import java.util.List;

@RestController
@RequestMapping("/api/cars")

public class CarController {
     @Autowired
    private CarService carService;

    @GetMapping("/{vin}/maintenance-records")
    public ResponseEntity<List<MaintenanceRecord>> getMaintenanceRecordsByVin(@PathVariable String vin) {
        List<MaintenanceRecord> records = carService.getMaintenanceRecordsByVin(vin);
        if (!records.isEmpty()) {
            return ResponseEntity.ok(records);
        } else {
            return (ResponseEntity<List<MaintenanceRecord>>) ((Object) ResponseEntity.notFound());
        }
    }

}
