package com.codecool.avril;

import com.codecool.avril.bands.Band;
import com.codecool.avril.bands.MainBand;
import com.codecool.avril.bands.WarmUpBand;
import com.codecool.avril.concerts.Concert;
import com.codecool.avril.concerts.Festival;
import com.codecool.avril.concerts.InDoor;
import com.codecool.avril.concerts.OutDoor;

public class Main {



    public static void main(String[] args) {
        Organizer organizer = new Organizer();
        System.out.println(Math.round(organizer.getProfit() / 1000000) * 100.0 / 100.0  + " MILLION FORINTS!! $$$$");
    }
}
