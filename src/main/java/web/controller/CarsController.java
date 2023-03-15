package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;
import web.model.Car;

import java.util.List;

@Controller
public class CarsController {
    private final
    CarServiceImp carServiceImp;
    public CarsController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }
    /**
     * имитация пост запроса в лице 5ти авто:
     */
    Car car1 = new Car("BMW", "3 series", 2800);
    Car car2 = new Car("Toyota", "Corolla", 1600);
    Car car3 = new Car("Lada", "Vesta", 1600);
    Car car4 = new Car("Toyota", "Supra", 3000);
    Car car5 = new Car("Volvo", "740 turbo", 2300);



    public void addCars() {
        carServiceImp.addCar(car1);
        carServiceImp.addCar(car2);
        carServiceImp.addCar(car3);
        carServiceImp.addCar(car4);
        carServiceImp.addCar(car5);
    }

    @GetMapping(value = "/cars")
    public String car(ModelMap modelMap, @RequestParam(value = "count", required = false, defaultValue = "5") int count) {
     /*   if (carServiceImp.getCars().isEmpty()) {
            System.out.println("added cars");
            addCars();

        }*/
        addCars();
        System.out.println(car1);
        List<Car> cars = carServiceImp.getCars();

        if (count < 5) {
            cars = carServiceImp.getCars().subList(0, count);
        }

        modelMap.addAttribute("cars", cars);
        return "cars";
    }
}
