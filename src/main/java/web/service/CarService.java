package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> listOfCars();
    public List<Car> getListOfCarByCount(List<Car> list, int count);
}
