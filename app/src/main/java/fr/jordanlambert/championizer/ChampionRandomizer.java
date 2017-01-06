package fr.jordanlambert.championizer;

import java.util.Random;

public class ChampionRandomizer {

    public static int randomizeNumber() {
        int randomNumber ;
        int minNumber = 0;
        int maxNumber = 5;

        Random rand = new Random();
        randomNumber = rand.nextInt(maxNumber - minNumber) + minNumber;

        return randomNumber;
    }

    public static String getChampionName(int idChamp) {
        int id = idChamp;
        String championName="";

        if(id==0){
            championName = "0";
        }
        else if(id==1){
            championName = "1";
        }
        else if(id==2){
            championName = "2";
        }
        else if(id==3){
            championName = "3";
        }
        else if(id==4){
            championName = "4";
        }
        else if(id==5){
            championName = "5";
        }

        return championName;
    }
}

