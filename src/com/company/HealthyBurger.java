package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy Burger", meat, price, "Ciabatta Bread");
    }

    public void addHealthyAddition1(String name, double price){
        super.addHamburgerAddition1(name, price);
    }
    public void addHealthyAddition2(String name, double price){
        super.addHamburgerAddition2(name, price);
    }

    @Override
    public double itemizeHamburger() {

        System.out.println("Add ons: " + super.getAddition1Name() + ", "+ super.getAddition2Name());
        return super.itemizeHamburger();
    }
}
