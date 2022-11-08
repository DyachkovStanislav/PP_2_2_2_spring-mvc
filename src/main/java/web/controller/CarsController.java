package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;


import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {


    @GetMapping
    public String tableOfCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        CarService carService = new CarServiceImpl();
        List<Car> list = carService.listOfCars();
        list = carService.getListOfCarByCount(list, count);
        model.addAttribute("list", list);
        return "cars";
    }
}
