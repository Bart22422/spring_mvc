package web.carServise;

import org.springframework.beans.factory.annotation.Autowired;
import web.model.Car;

import java.util.List;


public interface CarServise {
    List<Car> getCars();
    Car getcar(int id);
    void addCar(Car car);
}
