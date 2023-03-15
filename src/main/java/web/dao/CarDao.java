package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> getCars();
    Car getCar(long id);
    void addCar(Car car);
}
