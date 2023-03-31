package web.Servies;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServises {
    private static int carCount;
    private List<Car> cars;
    {
        cars = new ArrayList<>();

        cars.add(new Car(++carCount,"Lada", 2110));
        cars.add(new Car(++carCount,"Lada", 2111));
        cars.add(new Car(++carCount,"Lada", 2112));
        cars.add(new Car(++carCount,"Lada", 2113));
        cars.add(new Car(++carCount,"Lada", 2114));
    }
    public  List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
