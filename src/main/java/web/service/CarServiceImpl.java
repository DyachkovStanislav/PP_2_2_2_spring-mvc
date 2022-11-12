package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> listOfCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car(1, "BMW", "X1"));
        list.add(new Car(2, "AUDI", "A6"));
        list.add(new Car(3, "OPEL", "Astra"));
        list.add(new Car(4, "MERCEDES", "ML"));
        list.add(new Car(5, "LADA", "Vesta"));
        return list;
    }

    @Override
    public List<Car> getListOfCarByCount(List<Car> list, int count) {
        if (count > 5) {
            return list;
        } else {
            return list.stream().limit(count).collect(Collectors.toList());
        }


    }
}
