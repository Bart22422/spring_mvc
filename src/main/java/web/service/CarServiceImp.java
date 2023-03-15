package web.service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImp implements CarServiсe {
    private final CarDao carDao;
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars() {
        if(getCars().isEmpty()){
            carDao.addAll();
        }
        return carDao.getCars();
    }
    @Override
    public Car getCar(long id) {
        return carDao.getCar(id);
    }
    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }
}
