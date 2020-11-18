package com.company.HW;


public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(10);
        Cat cat1 = new Cat(4);
        Cat cat2 = new Cat(8);
        Cat cat3 = new Cat(5);
        Plate plate = new Plate(20);



        Cat [] arryacat = {cat,cat1,cat2,cat3};
            for (int i = 0; i < arryacat.length; i++) {
                plate.info();
                arryacat[i].eat(plate);
                plate.info();
            }

        plate.plusFood(15);
        plate.info();
        System.out.println();

    }
}

