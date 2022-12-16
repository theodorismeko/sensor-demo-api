package com.sensor.sensordemoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SensorDemoApiApplication {
//		implements CommandLineRunner

	public static void main(String[] args) {
		SpringApplication.run(SensorDemoApiApplication.class, args);
	}

//	@Autowired
//	SensorRepository sensorRepository;
//
//
//	@Override
//	public void run(String... args) {
//
//		Sensor sensor = Sensor.builder()
//				.sensorId(1)
//				.sensorType("Temperature")
//				.vendorEmail("tmeko@mail.com")
//				.vendorName("Teo Meko")
//				.description("Temperature Sensor")
//				.location("GR")
//				.build();
//
//		sensorRepository.save(sensor);
//
//	}
}
