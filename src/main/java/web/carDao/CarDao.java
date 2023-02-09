package web.carDao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCars();
    Car getcar();
    void addCar(Car car);
}
