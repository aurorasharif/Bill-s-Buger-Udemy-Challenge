package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;



    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(this.name + " on a " + this.breadRollType + " with " + this.meat +
                " ,price is: " + this.price);
    }

    public void addHamburgerAddition1(String itemName, double price){
        addition1Name=itemName;
        this.price+=price;
        System.out.println("Added " + this.addition1Name + " for an extra "+ price);
    }
    public void addHamburgerAddition2(String itemName, double price){
        addition2Name=itemName;
        this.price+=price;
        System.out.println("Added " + this.addition2Name + " for an extra "+ price);

    }
    public void addHamburgerAddition3(String itemName, double price){
        addition3Name=itemName;
        this.price+=price;
        System.out.println("Added " + this.addition3Name + " for an extra "+ price);

    }
    public void addHamburgerAddition4(String itemName, double price){
        addition4Name=itemName;
        this.price+=price;
        System.out.println("Added " + this.addition4Name + " for an extra "+ price);

    }

    public double itemizeHamburger(){
        return this.price;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public String getAddition4Name() {
        return addition4Name;
    }
}
