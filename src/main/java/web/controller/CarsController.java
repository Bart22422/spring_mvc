package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.carServise.CarServiseImp;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {
    @Autowired
    CarServiseImp carServiseImp;
    /**
     * имитация пост запроса в лице 5ти авто:
     */
    Car car1 = new Car("BMW", "3 series", 2800);
    Car car2 = new Car("Toyota", "Corolla", 1600);
    Car car3 = new Car("Lada", "Vesta", 1600);
    Car car4 = new Car("Toyota", "Supra", 3000);
    Car car5 = new Car("Volvo", "740 turbo", 2300);

    public void addCars() {
        carServiseImp.addCar(car1);
        carServiseImp.addCar(car2);
        carServiseImp.addCar(car3);
        carServiseImp.addCar(car4);
        carServiseImp.addCar(car5);
    }

    @GetMapping(value = "/cars")
    public String cars(ModelMap modelMap) {
        if (carServiseImp.getCars().size() <= 0) {
            System.out.println("added cars");
            addCars();
        }
        List<Car> cars = carServiseImp.getCars();
        modelMap.addAttribute("cars", cars);
        return "cars";
    }

    @GetMapping(value = "/cars/{count}")
    public String car(ModelMap modelMap, @PathVariable int count) {
        if (carServiseImp.getCars().isEmpty()) {
            System.out.println("added cars");
            addCars();
        }

        List<Car> cars = carServiseImp.getCars().subList(0, count);
        if (count >= 5) {
            cars = carServiseImp.getCars();
        }

        modelMap.addAttribute("cars", cars);
        return "cars";
    }
}
