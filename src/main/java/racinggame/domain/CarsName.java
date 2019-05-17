package racinggame.domain;

public class CarsName {

    public static String[] makeCarsName (String inputText) {
        String[] carsName;

        carsName = splitByComma(removeDuplicatedComma(removeBlank(inputText)));

        return carsName;
    }

    private static String removeBlank(String carsName) {
        carsName = carsName.replace(" ", "");

        return carsName;
    }

    private static String removeDuplicatedComma(String carsName) {
        while (carsName.contains(",,")) {
            carsName = carsName.replace(",,", ",");
        }

        return carsName;
    }

    private static String[] splitByComma(String carsName) {
        return carsName.split(",");
    }

}