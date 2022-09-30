package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    CarDao carDao = new CarDaoImpl();
//    private List<Car> list = new ArrayList<>();
//
//    {
//        list.add(new Car(1, "Tesla", 11));
//        list.add(new Car(2, "Toyota", 22));
//        list.add(new Car(3, "BMW", 33));
//        list.add(new Car(4, "Volkswagen", 44));
//        list.add(new Car(5, "Nissan", 55));
//    }


    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count < 5) {
            return carDao.getCars(count);
        } else {
            return this.getCars();
        }
    }
}
