package com.company;

public class Romashka extends Kvity {
    String title;

    public Romashka(String title) {
        this.title = title;
    }
      void Print(){
        System.out.println("Квіти: "+title);
    }

    @Override
    public void Grow() {
    System.out.println("ВИросла: "+title);
    }
}
