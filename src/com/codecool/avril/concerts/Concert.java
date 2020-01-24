package com.codecool.avril.concerts;

import com.codecool.avril.Style;
import com.codecool.avril.Util;
import com.codecool.avril.bands.MainBand;
import com.codecool.avril.bands.WarmUpBand;

public abstract class Concert {
    protected MainBand mainBand;
    protected WarmUpBand warmUpBand;
    protected int capacity;
    protected Style style;
    protected double duration;
    protected int ticketPrice;
    protected int beerPrice;
    protected int beerAmount;
    private static final int CHANCE_OF_FULL_HOUSE = 80;
    private static final int LOW_BOUNDRY_OF_AUDIENCERATE = 70;
    private static final int HIGH_BOUNDRY_OF_AUDIENCERATE = 80;
    private static final int BEER_PER_HOUR = 2;
    protected int audienceRate;

    public Concert(MainBand mainBand, WarmUpBand warmUpBand) {
        this.mainBand = mainBand;
        this.warmUpBand = warmUpBand;
        this.style = mainBand.getStyle();
        setAudienceRate();
        this.ticketPrice = Util.generateNumberBetweeValues(12000,15000);


    }

    public boolean isFullHouse() {
        return Util.generateChance(CHANCE_OF_FULL_HOUSE);
    }


    public int getTicketSales() {
        if (isFullHouse()) {
            return capacity * ticketPrice;
        } else {
            return getAudience() * ticketPrice;
        }

    }

    private int getAudience() {
        return audienceRate * capacity / 100;
    }

    private void setAudienceRate() {
        this.audienceRate = Util.generateNumberBetweeValues(LOW_BOUNDRY_OF_AUDIENCERATE, HIGH_BOUNDRY_OF_AUDIENCERATE);
    }

    private double getBeerAmount() {
        return duration * BEER_PER_HOUR * getAudience();
    }


    public double getBarIncome() {
        return getBeerAmount() * beerPrice;
    }


}
