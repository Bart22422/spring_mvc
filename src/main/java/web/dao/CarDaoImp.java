package web.dao;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository("carDaoImpl")
public class CarDaoImp implements CarDao {
    private List<Car> carRepositories = new ArrayList<>();

    @Override
    public List<Car> getCars() {
        return carRepositories;
    }

    @Override
    public Car getCar(long id) {
        Car car = null;
        for (Car car1 : carRepositories){
            if (car1.getId()==id){
                return car1;
            }
        }
        return car;
    }

    @Override
    public void addCar(Car car) {
        carRepositories.add(car);
    }
}
