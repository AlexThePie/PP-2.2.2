package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {


        List<Car> getAllListCars();
        List<Car> getCountCars(int count);

}
