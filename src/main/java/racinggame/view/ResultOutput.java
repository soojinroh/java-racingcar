package racinggame.view;

import racinggame.domain.Car;

import java.util.List;

public class ResultOutput {
    static StringBuilder sb = new StringBuilder();

    public static void winnersOutput(List<String> winners) {
        sb.setLength(0);
        sb.append(String.join(", ", winners));
        sb.append("가 최종 우승했습니다.");

        System.out.println(sb);
    }

    public static void eachGameOutput(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.toString());
        }

        System.out.println();
    }

    public static void eachGameOutputWithOutToString(List<Car> cars) {
        StringBuilder eachGameResult = new StringBuilder();

        for (Car car : cars) {
            eachGameResult.append(car.getName());
            eachGameResult.append(" : ");

            for (int i = 0; i < car.getPosition(); i++) {
                eachGameResult.append("-");
            }
            eachGameResult.append("\n");
        }

        System.out.println(eachGameResult.toString());
    }
}
