package com.company;

public class HealthyBurger extends Hamburger {
    private Sesam sesam;
    private Avocado avocado;

    public HealthyBurger(int price, String meat, String bread) {
        super(price, meat, bread);
        this.sesam = null;
        this.avocado = null;
    }

    public void setSesam(Sesam sesam) {
        this.sesam = sesam;
        setPrice(sesam.getPrice());
    }

    public void setAvocado(Avocado avocado) {
        this.avocado = avocado;
        setPrice(avocado.getPrice());
    }

}
