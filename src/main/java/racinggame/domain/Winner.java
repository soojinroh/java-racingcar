package racinggame.domain;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    private List<String> winners = new ArrayList<>();

    public Winner(List<Car> cars) {
        int maxDistance = judgeMaxDistance(cars);

        for (Car car : cars) {
            if (car.isMatch(maxDistance)) {
                winners.add(car.getName());
            }
        }
    }

    private int judgeMaxDistance(List<Car> cars) {
        int maxDistance = 0;

        for (Car car : cars) {
            if (car.getPosition() > maxDistance ) {
                maxDistance = car.getPosition();
            }
        }

        return maxDistance;
    }

    public List<String> getWinners() {
        return winners;
    }

    public String toString() {
        String winnerList = "";

        for (int i = 0; i < winners.size() - 1; i++) {
            winnerList += (winners.get(i) + " ");
        }

        winnerList += winners.get(winners.size() - 1);

        return winnerList;
    }
}
