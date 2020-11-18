package com.company.HW;

public class Plate {
    private int food;
    int counter = 0;

    public Plate ( int food) {
        this.food = food;
    }

    public void decreazFood (int val, boolean h) {

       this.food -= val;

        if (0 <= this.food) {
            counter++;
            h = true;
            System.out.println(h + " " + counter + " кошка сыта.");


        }else if (0 >= this.food) {
            counter++;
            this.food = this.food + val;
            h = false;
            System.out.println(h + " " + counter +  " кошке не поела");
        }

    }
    public void plusFood(int plus) {
        this.food += plus;
}

    public void info () {
        System.out.println("Plate: " + food);

    }
}
