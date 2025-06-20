package com.sanli.bootstrap;

import com.sanli.entity.Car;
import com.sanli.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@ConfigurationPropertiesBinding
@Component
public class DataGenerator implements CommandLineRunner {


    private final CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        var BMW = new Car("BMW", "M3");
        var honda = new Car("Honda", "Civic");
        var toyota = new Car("Toyota", "Camry");

        carRepository.save(BMW);
        carRepository.save(honda);
        carRepository.save(toyota);


    }
}
