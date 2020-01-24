package com.codecool.avril;

import java.util.Random;

public class Weather {

    public static boolean isRaining(){
        return Util.generateChance(30);
    }
}
