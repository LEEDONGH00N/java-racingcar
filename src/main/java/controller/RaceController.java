package controller;

import domain.Car;
import service.RaceService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RaceController {
    private RaceService raceService = new RaceService();
    private List<Car> cars = new ArrayList<>();
    private int count;
    private int winMoves = 0;
    public void init(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] carNames = scanner.nextLine().split(",");
        for (String name : carNames) {
            if (name.length() <= 5) {
                cars.add(new Car(name));
            }
        }
        System.out.println("시도할 회수는 몇회인가요?");
        count = scanner.nextInt();
    }
    public void raceStart(){
        printResult();
        for(int i = 0; i < count; i++) {
            raceService.getRandomNumber(cars);
            printResult();
        }
    }
    private void printResult(){
        System.out.println("\n실행 결과");
        for(Car car : cars){
            System.out.println(car.getName() + " : " + car.getMoved());
            if(car.getMoved().length() > winMoves)
                winMoves = car.getMoved().length();
        }
    }
    public void finalResult(){
        List<Car> winner = new ArrayList<>();
        for(Car car : cars){
            if(car.getMoved().length() == winMoves)
                winner.add(car);
        }
        String result = "\n";
        for (int i = 0; i < winner.size(); i++) {
            if (i > 0)
                result += ", ";
            result += winner.get(i).getName();
        }
        result += ("이(가) 최종 우승했습니다.");
        System.out.println(result);
    }

}
