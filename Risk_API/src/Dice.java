import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Dice {
    public static int roll() {
        int diceResult = new Random().nextInt(6) + 1;
        return diceResult;

    }
    public static Integer[] roll(int numberOfDices) {
        Integer[] dicesResult = new Integer[numberOfDices];
        for (int counter = 0; counter < numberOfDices; counter++) {
            dicesResult[counter] = new Random().nextInt(6) + 1;
        }
        Arrays.sort(dicesResult, Collections.reverseOrder());
        return dicesResult;
    }
}