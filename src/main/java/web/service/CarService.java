package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car(1, "BMW", 5));
        cars.add(new Car(2, "Audi", 4));
        cars.add(new Car(3, "Mercedes", 6));
        cars.add(new Car(4, "Tesla", 3));
        cars.add(new Car(5, "Toyota", 2));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}