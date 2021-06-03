package com.company;

public class Buket  {
   String name;
   int size;
    int  price;

    public Buket(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public Buket() {
    }

    void Print(){
        System.out.println("Назва букету: "+name);
        System.out.println("Розмір букету:  "+size);
        System.out.println("Ціна букету:  "+price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(this.name.isEmpty()){
            this.name = name;}
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString(){
        return name+"\n"+size+"\n"+price;
    }

        public boolean equals(Object obj){
        Buket buketprice  =  (Buket) obj;
        return this.price == buketprice.price;
        }

    public static class Upakovka{

      String material;
      String color;

        public Upakovka(String material, String color) {
            this.material = material;
            this.color = color;
        }
        void Print(){
            System.out.println("Матеріал обгортки:  "+material);
            System.out.println("Колір Обгортки:  "+color);
        }
    }
}
