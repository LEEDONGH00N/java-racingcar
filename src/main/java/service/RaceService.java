package service;

import domain.Car;

import java.util.List;
import java.util.Random;

public class RaceService {
    private Random random = new Random();
    public void getRandomNumber(List<Car> cars){
        for(Car car : cars){
            int randomValue = random.nextInt(10);
            if (randomValue < 4)
                continue;
            car.setMoved(car.getMoved() + "-");
        }
    }
}
