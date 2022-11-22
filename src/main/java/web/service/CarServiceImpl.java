package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Skoda", 2500000));
        carList.add(new Car(2, "BMW", 5000000));
        carList.add(new Car(3, "Lada", 1500000));
        carList.add(new Car(4, "Opel", 2750000));
        carList.add(new Car(5, "Tesla", 8000000));
    }

    public List<Car> getLimitCars(Integer count) {
        return carList.stream().limit(count).toList();
    }
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public void add(Car car) {

    }

    @Override
    public List<Car> listCars() {
        return null;
    }

}
