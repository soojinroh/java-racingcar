package racinggame;

import racinggame.domain.Car;
import racinggame.domain.Game;
import racinggame.domain.Winner;
import racinggame.view.ResultOutput;
import racinggame.view.UserInput;

import java.util.ArrayList;
import java.util.List;

import static racinggame.domain.CarsName.makeCarsName;

public class AppController {

    public void playRacingGame() {
        List<Car> cars;

        try {
            cars = readyGame();
        } catch (IllegalArgumentException e) {
            playRacingGame();
            return;
        }

        printWinner(startGame(cars, UserInput.inputGameCount()));
    }

    public List<Car> readyGame() {
        String[] carsName = makeCarsName(UserInput.inputCarsName());
        List<Car> cars = new ArrayList<>();

        for (String carName : carsName) {
            cars.add(new Car(carName));
        }

        return cars;
    }

    public Winner startGame(List<Car> cars, int gameCount) {
        Game game = new Game();

        for (int i = 0; i < gameCount; i++) {
            cars = game.playGame(cars);
            ResultOutput.eachGameOutputWithOutToString(cars);
        }

        return new Winner(cars);
    }

    public void printWinner(Winner winners) {
        ResultOutput.winnersOutput(winners.getWinners());
    }
}
