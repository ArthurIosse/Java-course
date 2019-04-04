package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger(25,"rind","white bread");

        System.out.println("price = "+ hamburger.getPrice());

        Hasa hasa = new Hasa();
        Tomato tomato = new Tomato();
        Onion onion = new Onion();
        Pickles pickles = new Pickles();

        hamburger.setHasa(hasa);
        hamburger.setOnion(onion);
        hamburger.setPickles(pickles);
        hamburger.setTomato(tomato);

        System.out.println("price = "+ hamburger.getPrice());

        HealthyBurger veggie = new HealthyBurger(35,"soya","black bread");

        System.out.println("veggie price = "+veggie.getPrice());

        Sesam sesam = new Sesam();
        Avocado avocado = new Avocado();

        veggie.setAvocado(avocado);
        veggie.setSesam(sesam);
        veggie.setHasa(hasa);

        System.out.println("veggie with sesam and avocado = "+veggie.getPrice());


        DeluxeBurger deluxe = new DeluxeBurger(45,"bacon","white bread");

        System.out.println("deluxe price = "+ deluxe.getPrice());

        deluxe.setHasa(hasa);

        System.out.println("deluxe price = "+ deluxe.getPrice());

    }
}
