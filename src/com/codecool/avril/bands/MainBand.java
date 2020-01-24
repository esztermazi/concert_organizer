package com.codecool.avril.bands;

import com.codecool.avril.Style;

import java.util.List;

public class MainBand extends Band {
    public MainBand(String name, Style style) {
        super(name, style);
    }

    public WarmUpBand chooseWarmUpBand(List<WarmUpBand> warmUpBands){
        for (WarmUpBand warmUpBand: warmUpBands) {
            if (warmUpBand.getStyle() == this.getStyle()){
                return warmUpBand;
            }
        }
        return null;
    }
}
