package web.service;

import web.model.Car;

import java.util.List;


public interface CarServiсe {
    List<Car> getCars();
    Car getCar(long id);
    void addCar(Car car);
}
