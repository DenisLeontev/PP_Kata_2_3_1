package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    private final List<Car> listCars;

    public CarServiceImp() {
        listCars = new ArrayList<>();
        listCars.add(new Car("Audi1", 1, "number1"));
        listCars.add(new Car("Audi2", 2, "number2"));
        listCars.add(new Car("Audi3", 3, "number3"));
        listCars.add(new Car("Audi4", 4, "number4"));
        listCars.add(new Car("Audi5", 5, "number5"));
    }

    @Override
    public List<Car> getAllCars() {
        return listCars;
    }

    @Override
    public List<Car> getAmountCars(int amount) {
        return listCars.stream().limit(amount).collect(Collectors.toList());
    }
}
