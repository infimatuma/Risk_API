public class Battle {
    public static int resolve(int numberOfAttackers, int numberOfDefenders) {
        while (numberOfAttackers > 0 && numberOfDefenders > 0) {
            int attackRolls = Math.min(3, numberOfAttackers);
            int defenceRolls = Math.min(2, numberOfDefenders);
            Integer[] attack = Dice.roll(attackRolls);
            Integer[] defence = Dice.roll(defenceRolls);
            for(int counter = 0; counter < Math.min(attackRolls, defenceRolls); counter++) {
                if (attack[counter] > defence[counter]) {
                    numberOfDefenders--;
                }
                else {
                    numberOfAttackers--;
                }
            }
        System.out.println (numberOfAttackers + " vs. " + numberOfDefenders);
        }
        int result;
        if(numberOfAttackers > numberOfDefenders) {
            result = numberOfAttackers;
        }
        else {
            result = - numberOfDefenders;
        }
        System.out.println(result);
        return (result);
    }
}