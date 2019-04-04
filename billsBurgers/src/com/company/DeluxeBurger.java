package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(int price, String meat, String bread) {
        super(price, meat, bread);
    }

    @Override
    public void setOnion(Onion onion) {
        System.out.println("cannot add to deluxe");
    }

    @Override
    public void setPickles(Pickles pickles) {
        System.out.println("cannot add to deluxe");
    }

    @Override
    public void setHasa(Hasa hasa) {
        System.out.println("cannot add to deluxe");
    }

    @Override
    public void setTomato(Tomato tomato) {
        System.out.println("cannot add to deluxe");
    }
}
