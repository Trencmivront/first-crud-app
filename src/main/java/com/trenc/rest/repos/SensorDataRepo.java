package com.trenc.rest.repos;

import com.trenc.rest.models.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorDataRepo extends JpaRepository<SensorData, Long> {
}
