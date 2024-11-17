package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    public List<Car> setCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "Red", 2020));
        cars.add(new Car("Audi", "Blue", 2015));
        cars.add(new Car("Honda", "Yellow", 2010));
        cars.add(new Car("Opel", "Grey", 2022));
        cars.add(new Car("Ford", "Black", 2019));
        return cars;
    }

   @Override
   public List<Car> getCarsFromList(int count) {
        if (count <= 0 || count > setCars().size()) {
            return setCars();
        }
        return setCars().subList(0, count);
   }
}


