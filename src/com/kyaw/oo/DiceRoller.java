package com.kyaw.oo;

import java.util.concurrent.ThreadLocalRandom;

public class DiceRoller {

    private final Dice diceOne;
    private final Dice diceTwo;

    public DiceRoller(Dice diceOne, Dice diceTwo) {
        this.diceOne = diceOne;
        this.diceTwo = diceTwo;
    }

    public void roll() {
        int resultOne = diceOne.roll();
        int resultTwo = diceTwo.roll();

        System.out.printf("Dice one has %d sides and dice two has %d sides.\n",
                diceOne.getSides(), diceTwo.getSides());

        decideWinner(resultOne, resultTwo);
    }

    private void decideWinner(int r1, int r2) {
        if (r1 > r2) {
            System.out.printf("Dice one comes up %d and dice two has %d. So, dice one is the winner!",
                    r1, r2);
        } else {
            System.out.printf("Dice two comes up %d and dice one has %d. So, dice two is the winner!",
                    r2, r1);
        }
    }

    public static void main(String[] args) {

        Dice diceOne = new Dice();
        diceOne.setSides(6);

        Dice diceTwo = new Dice();
        diceTwo.setSides(6);

        DiceRoller roller = new DiceRoller(diceOne, diceTwo);
        roller.roll();
    }


}

class Dice {

    private int sides;

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return this.sides;
    }

    public int roll() {
        return ThreadLocalRandom.current().nextInt(sides + 1);
    }
}

