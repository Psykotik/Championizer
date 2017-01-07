package fr.jordanlambert.championizer;

import java.util.Random;

public class ChampionRandomizer {

    public static int randomizeNumber(int min, int max) {
        int randomNumber ;
        int minNumber = min;
        int maxNumber = max;

        Random rand = new Random();
        randomNumber = rand.nextInt(maxNumber - minNumber) + minNumber;

        return randomNumber;
    }
}

