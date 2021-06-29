package com.company;

public class Main {
    public static void main(String[] args) {

        Buket buket = new Buket("Tr", 34, 349);



        Kvity kvity = new Romashka("Rdgg madgdshka");
        Buket.Upakovka upakovka = new Buket.Upakovka("Bumaga", "Red");
        buket.Print();
        kvity.Print();
        upakovka.Print();
        PrintTest(buket);
        kvity.Grow();
        Buket buket1 = new Buket("Rgiuddddfse",14,88);
        Buket buket2 = new Buket("Rouse",14,88);
                System.out.println(buket1.equals(buket2));

        Flowers flowers = Flowers.Romashka;
        switch (flowers) {
            case Rouse -> { System.out.println("Rouse");break; }
            }

    }
    public static void PrintTest(Buket buket){
        buket.Print(); }
}