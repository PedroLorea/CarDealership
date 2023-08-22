package br.portoalegre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.portoalegre.car.Car;
import br.portoalegre.car.CarRepository;
import br.portoalegre.car.CarRequestDTO;
import br.portoalegre.car.CarResponseDTO;

@RestController
@RequestMapping("cars")
public class CarController {
    
    @Autowired
    private CarRepository repository;

    // @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<CarResponseDTO> getAll(){
        List<CarResponseDTO> carList = repository.findAll().stream().map(CarResponseDTO::new).toList(); 
        return carList;
    }

    // @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveCar(@RequestBody CarRequestDTO car){
        Car carData = new Car(car);
        repository.save(carData);
    }
}
