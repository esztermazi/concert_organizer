package com.codecool.avril.concerts;

import com.codecool.avril.Util;
import com.codecool.avril.bands.MainBand;
import com.codecool.avril.bands.WarmUpBand;

public class InDoor extends Concert {
    public InDoor(MainBand mainBand, WarmUpBand warmUpBand) {
        super(mainBand, warmUpBand);
        this.capacity = 3000;
        this.duration = 1.5;
    }
}
