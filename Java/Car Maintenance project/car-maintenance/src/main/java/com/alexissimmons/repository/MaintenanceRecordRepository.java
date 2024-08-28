package com.alexissimmons.repository;

import com.alexissimmons.car_maintenance.entity.MaintenanceRecord;

@Repository
public interface MaintenanceRecordRepository extends JpaRepository<MaintenanceRecord, Long> {
}

