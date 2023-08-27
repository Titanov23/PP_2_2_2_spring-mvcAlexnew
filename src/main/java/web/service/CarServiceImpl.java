package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
 @Service

public class CarServiceImpl implements CarService {
    private List<Car> carList = new ArrayList<>();
    public CarServiceImpl(){

        carList.add(new Car("red","vw", 5));
        carList.add(new Car("white","toyota", 2));
        carList.add(new Car("green","bmw", 3));
        carList.add(new Car("black","renault", 4));
        carList.add(new Car("pink","cadillac", 7));
}
    @Override
    public List<Car> getCountCar(Integer count) {
    if (count>=5){
        return carList;
    }
       return carList.subList(0, count);
}
               }
