import java.util.Arrays;

public class Application {
    public static void main (String args[]) {
        System.out.println(Dice.roll());
        Integer[] rolls = Dice.roll(3);
        System.out.println(Arrays.toString(rolls));
        int k = Battle.resolve(7,10);
    }
}
