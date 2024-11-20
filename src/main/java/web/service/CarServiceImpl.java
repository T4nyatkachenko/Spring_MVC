package web.service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {



    private final List<Car> carList = new ArrayList<>(List.of(
            new Car("BMW", "Red", 2020),
            new Car("Audi", "Blue", 2015),
            new Car("Honda", "Yellow", 2010),
            new Car("Opel", "Grey", 2022),
            new Car("Ford", "Black", 2019)
    ));



   @Override
   public List<Car> getCarsFromList(int count) {
        if (count <= 0 || count > carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
   }
}


