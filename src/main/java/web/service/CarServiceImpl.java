package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<Car> getAllListCars() {
        return carList;

    }

    @Override
    public List<Car> getCountCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
