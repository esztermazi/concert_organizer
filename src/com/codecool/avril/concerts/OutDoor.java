package com.codecool.avril.concerts;

import com.codecool.avril.Util;
import com.codecool.avril.Weather;
import com.codecool.avril.bands.MainBand;
import com.codecool.avril.bands.WarmUpBand;

public class OutDoor extends Concert {


    public OutDoor(MainBand mainBand, WarmUpBand warmUpBand) {
        super(mainBand, warmUpBand);
        this.capacity = 5000;
        this.duration = 2;
        isConcertCancelled();
    }


    private void isConcertCancelled() {
        if (Weather.isRaining()) {
            this.audienceRate = 0;
        }
    }
}
