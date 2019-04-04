package com.company;

public class Hamburger {
    private int price;
    private String meat;
    private String bread;
    private Onion onion;
    private Pickles pickles;
    private Hasa hasa;
    private Tomato tomato;

    public Hamburger(int price, String meat, String bread) {
        this.price = price;
        this.meat = meat;
        this.bread = bread;
        this.onion = null;
        this.tomato = null;
        this.pickles = null;
        this.hasa = null;
    }

    public void setPrice(int price){
        this.price += price;
    }

    public void setOnion(Onion onion) {
        this.onion = onion;
        price += onion.getPrice();
    }

    public void setPickles(Pickles pickles) {
        this.pickles = pickles;
        price += pickles.getPrice();
    }

    public void setHasa(Hasa hasa) {
        this.hasa = hasa;
        price += hasa.getPrice();
    }

    public void setTomato(Tomato tomato) {
        this.tomato = tomato;
        price += tomato.getPrice();
    }

    public int getPrice(){
        return price;
    }
}
