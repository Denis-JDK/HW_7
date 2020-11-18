package com.company.HW;

public class Cat {
    private int appetit;
    private boolean hyngry;

    public Cat (int appetit) {
        this.appetit = appetit;
        this.hyngry = false;
    }

    public void eat (Plate plate) {

       plate.decreazFood(appetit, hyngry);

    }

    }



