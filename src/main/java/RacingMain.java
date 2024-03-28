import controller.RaceController;

public class RacingMain {

    public static void main(String[] args) {
        RaceController raceController = new RaceController();
        raceController.init();
        raceController.raceStart();
        raceController.finalResult();
    }
}
