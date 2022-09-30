package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Controller
@RequestMapping(value = "/cars")
public class CarController {
    CarDao carDao = new CarDaoImpl();

    @GetMapping
    public String getCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") Integer count) {
//        List<Car> list = null;
//        if (count != null) {
//            list = carDao.getCars(count);
//        } else {
//            list = carDao.getCars();
//        }
//        model.addAttribute("cars", list);

        List<Car> list = carDao.getCars(count);
        model.addAttribute("cars", list);

        return "car/cars";
    }
}
