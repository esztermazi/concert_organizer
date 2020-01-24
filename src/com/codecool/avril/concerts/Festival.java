package com.codecool.avril.concerts;

import com.codecool.avril.bands.MainBand;
import com.codecool.avril.bands.WarmUpBand;

public class Festival extends Concert {
    public Festival(MainBand mainBand, WarmUpBand warmUpBand) {
        super(mainBand, warmUpBand);
        this.capacity = 8000;
        this.duration = 6;
    }
}
