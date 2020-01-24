package com.codecool.avril;

import com.codecool.avril.bands.MainBand;
import com.codecool.avril.bands.WarmUpBand;
import com.codecool.avril.concerts.Concert;
import com.codecool.avril.concerts.Festival;
import com.codecool.avril.concerts.InDoor;
import com.codecool.avril.concerts.OutDoor;

import java.util.ArrayList;
import java.util.List;

public class Organizer {
    private List<WarmUpBand> warmUpBands = new ArrayList<>();
    private List<MainBand> mainBands = new ArrayList<>();
    private List<Concert> concerts = new ArrayList<>();
    private double profit;
    private final double SHAREFROMTICKETS = 0.4;

    public void createBands() {
        warmUpBands.add(new WarmUpBand("Ricsárdgír", Style.ROCK));
        warmUpBands.add(new WarmUpBand("Tankcsapda", Style.ROCK));
        warmUpBands.add(new WarmUpBand("Lady_Gaga", Style.POP));
        warmUpBands.add(new WarmUpBand("Maszkura", Style.JAZZ));
        warmUpBands.add(new WarmUpBand("JAZZ_MEG_AZ", Style.POP));
        warmUpBands.add(new WarmUpBand("Kefír", Style.JAZZ));


        mainBands.add(new MainBand("Metallica", Style.ROCK));
        mainBands.add(new MainBand("MarilynManson", Style.ROCK));
        mainBands.add(new MainBand("BritneySpears", Style.POP));
        mainBands.add(new MainBand("Tatu", Style.POP));
        mainBands.add(new MainBand("Miles Davis Quintet", Style.JAZZ));
        mainBands.add(new MainBand("The Jazz Messengers", Style.JAZZ));
    }

    public void createEvents(){

        for (int i = 0; i < 3; i++) {
            int randomBand = Util.generateNumberBetweeValues(0, mainBands.size());
            MainBand mainBand = mainBands.get(randomBand);
            MainBand mainBand2 = mainBands.get(randomBand);
            MainBand mainBand3 = mainBands.get(randomBand);
            concerts.add(new InDoor(mainBand, mainBand.chooseWarmUpBand(warmUpBands)));
            concerts.add(new OutDoor(mainBand2, mainBand2.chooseWarmUpBand(warmUpBands)));
            concerts.add(new Festival(mainBand3, mainBand3.chooseWarmUpBand(warmUpBands)));

        }
        int randomBand = Util.generateNumberBetweeValues(0, mainBands.size());
        MainBand mainBand4 = mainBands.get(randomBand);
        concerts.add(new Festival(mainBand4, mainBand4.chooseWarmUpBand(warmUpBands)));
    }

    public Organizer() {
        createBands();
        createEvents();
        this.profit = 0;
    }


    public double getProfit(){
        for (Concert concert: concerts) {
            profit += concert.getBarIncome() + concert.getTicketSales() * SHAREFROMTICKETS;
        }
        return profit;
    }
}




