package fr.jordanlambert.championizer;

import java.util.Random;

/**
 * Created by jordan on 30/12/2016.
 */

public class ChampionRandomizer {

    public static int randomizeNumber() {
        int randomNumber ;
        int minNumber = 0;
        int maxNumber = 150;

        Random rand = new Random();
        randomNumber = rand.nextInt(maxNumber - minNumber) + maxNumber;

        return randomNumber;
    }
}
