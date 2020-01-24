package com.codecool.avril;

import java.util.Random;

public class Util {
    private static Random random = new Random();


    public static boolean generateChance(int percent) {
        return random.nextDouble() * 100 < percent;
    }

    public static int generateNumberBetweeValues(int low, int high) {
        return random.nextInt(high - low) + low;
    }
}
