public class Battle {
    public static int resolve(int numberOfAttackers, int numberOfDefenders) {
        int attackBonusDice = 0; //to implement bonus
        int defenceBonusDice = 0; //to implement bonus
        while (numberOfAttackers > 0 && numberOfDefenders > 0) { //fight to death :)
            int attackRolls = Math.min(3, numberOfAttackers) + attackBonusDice; //calculate amount of attacking dices
            int defenceRolls = Math.min(2, numberOfDefenders) + defenceBonusDice; //calculate amount of attacking dices
            Integer[] attack = Dice.roll(attackRolls); //roll attacker's dices and save sorted value (max -> min to array)
            Integer[] defence = Dice.roll(defenceRolls); //roll defender's dices and save sorted value (max -> min to array)
            for(int counter = 0; counter < Math.min(attackRolls, defenceRolls); counter++) {
                //compare maximum value of att/def dices
                if (attack[counter] > defence[counter]) {
                    numberOfDefenders--;
                    //attacker wins only if her dice value > defender's dice value
                }
                else {
                    numberOfAttackers--;
                    //defender wins if her dice value > or = attacker's dice value
                }
            } //for
        System.out.println (numberOfAttackers + " vs. " + numberOfDefenders);
        } //while
        int result; //prepare result
        //returns positive value of numberOfAttackers, if attacker wins;
        // returns negative value of numberOfDefenders, if defender wins
        if(numberOfAttackers > numberOfDefenders) {
            result = numberOfAttackers;
        }
        else {
            result = - numberOfDefenders;
        }
        System.out.println(result);
        return (result);
    } //resolve method
}