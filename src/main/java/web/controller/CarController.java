package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Servies.CarServises;

@Controller
public class CarController {
    private final CarServises carServises;
    @Autowired
    public CarController(CarServises carServises) {
        this.carServises = carServises;
    }
    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars",carServises.getCars(count));
        return "cars";
    }
}
