package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService service;

    @GetMapping(value = "/cars")
    public String getCars(ModelMap modelMap){
        modelMap.addAttribute("carList",service.getCarList());
        return "cars";
    }



}
