package com.sensor.sensordemoapi.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Getter
@Setter
@Table(name = "sensor_reader")
public class SensorReader {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private Integer sensorId;
    @Column
    private String readingType;

    public SensorReader(String readingType, Date readingDate, String description,
                        String readingValue, Time readingTime) {
        this.readingType = readingType;
        this.readingDate = readingDate;
        this.description = description;
        this.readingValue = readingValue;
        this.readingTime = readingTime;
    }

    @Column
    private Date readingDate;
    @Column
    private String description;
    @Column
    private String readingValue;

    @Column
    private Time readingTime;

    @ManyToOne
    private Sensor sensor;

    public SensorReader() {

    }
}
