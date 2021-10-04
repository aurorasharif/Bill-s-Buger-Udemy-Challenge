package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe Burger", "Beef Patty", 19.10 , "Italian Bread");
        super.addHamburgerAddition1("Chips", 0);
        super.addHamburgerAddition2("Drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String itemName, double price) {
        System.out.println("Sorry, no additional items can be added to the Deluxe Burger");;
    }

    @Override
    public void addHamburgerAddition2(String itemName, double price) {
        System.out.println("Sorry, no additional items can be added to the Deluxe Burger");;
    }

    @Override
    public void addHamburgerAddition3(String itemName, double price) {
        System.out.println("Sorry, no additional items can be added to the Deluxe Burger");;
    }

    @Override
    public void addHamburgerAddition4(String itemName, double price) {
        System.out.println("Sorry, no additional items can be added to the Deluxe Burger");;
    }
}
