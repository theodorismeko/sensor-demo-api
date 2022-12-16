package com.sensor.sensordemoapi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@Table(name = "sensor")
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sensorId;

    @Column
    private String sensorType;

    @Column
    private String vendorName;

    @Column
    private String vendorEmail;

    @Column
    private String description;

    @Column
    private String location;

    @OneToMany(mappedBy = "sensor")
    private List<SensorReader> sensorReaders;

    public Sensor(){}
    public Sensor(Integer sensorId, String sensorType, String vendorName, String vendorEmail, String description, String location, List<SensorReader> sensorReaders) {
        this.sensorId = sensorId;
        this.sensorType = sensorType;
        this.vendorName = vendorName;
        this.vendorEmail = vendorEmail;
        this.description = description;
        this.location = location;
        this.sensorReaders = sensorReaders;
    }
}
