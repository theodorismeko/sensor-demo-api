package com.sensor.sensordemoapi.repository;

import com.sensor.sensordemoapi.domain.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "sensors", path = "sensors")
public interface SensorRepository extends JpaRepository<Sensor, Integer> {

}

