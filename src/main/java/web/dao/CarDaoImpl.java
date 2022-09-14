package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    List<Car> list = new ArrayList<>();

    {
        list.add(new Car(1, "Tesla", 11));
        list.add(new Car(2, "Toyota", 22));
        list.add(new Car(3, "BMW", 33));
        list.add(new Car(4, "Volkswagen", 44));
        list.add(new Car(5, "Nissan", 55));
    }

    @Override
    public List<Car> getCars() {
        return List.copyOf(list);
    }

    @Override
    public List<Car> getCars(int count) {
        return List.copyOf(list).stream().limit(count).toList();
    }
}
