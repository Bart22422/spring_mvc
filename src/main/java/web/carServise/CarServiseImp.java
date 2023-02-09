package web.carServise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiseImp implements CarServise{
    List <Car> databaseImitation = new ArrayList<>();
    @Override
    public List<Car> getCars() {
        return databaseImitation;
    }

    @Override
    public Car getcar(int id) {
        return databaseImitation.get(id);
    }

    @Override
    public void addCar(Car car) {
        databaseImitation.add(car);
    }
}
