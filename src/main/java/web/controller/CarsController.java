package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;
import web.model.Car;
import web.service.CarServiсe;

import java.util.List;

@Controller
public class CarsController {
    private final
    CarServiсe carServiceImp;
    public CarsController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;
    }
    /**
     * имитация пост запроса в лице 5ти авто:
     */


    @GetMapping(value = "/cars")
    public String car(ModelMap modelMap, @RequestParam(value = "count", required = false, defaultValue = "5") int count) {

        List<Car> cars = carServiceImp.getCars();
        if (count < 5) {
            cars = carServiceImp.getCars().subList(0, count);
        }
        modelMap.addAttribute("cars", cars);
        return "cars";
    }
}
