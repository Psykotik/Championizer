package fr.jordanlambert.championizer;

import java.util.Random;

/**
 * Created by jordan on 30/12/2016.
 */

public class ChampionRandomizer {

    public static int randomizeNumber() {
        int randomNumber ;
        int maxNumber = 150;

        Random rand = new Random();
        randomNumber = rand.nextInt(maxNumber) +1;

        return randomNumber;
    }
}
