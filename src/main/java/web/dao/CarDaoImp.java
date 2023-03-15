package web.dao;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository("carDaoImpl")
public class CarDaoImp implements CarDao {
    private List<Car> carRepositories = new ArrayList<>( );


/*просто для заполнения репозитория*/
    public void addAll(){
        Car car1 = new Car("BMW", "3 series", 2800);
        Car car2 = new Car("Toyota", "Corolla", 1600);
        Car car3 = new Car("Lada", "Vesta", 1600);
        Car car4 = new Car("Toyota", "Supra", 3000);
        Car car5 = new Car("Volvo", "740 turbo", 2300);
        addCar(car1);
        addCar(car2);
        addCar(car3);
        addCar(car4);
        addCar(car5);
    }

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
