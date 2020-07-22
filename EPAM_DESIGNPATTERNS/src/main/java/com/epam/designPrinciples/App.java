package com.epam.designPrinciples;

import com.epam.srp.*;
import com.epam.statePattern.*;
import com.epam.abstractFactory.*;
import com.epam.builderPattern.*;
import com.epam.chainOfResponsibilities.*;
import com.epam.proxyPattern.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("\n***** Design Principles *****");
        System.out.println("\n***** Single Responsibility Principle *****");
        CalorieTracker calorieTracker = new CalorieTracker(1000);
        calorieTracker.trackCalories(2000);
        calorieTracker.trackCalories(3000);
        System.out.println("\n***** Abstract Factory Pattern *****");
        System.out.println("\nLion and Cow implements Animals");
        Lion lion = new Lion();
        lion.eats();
        lion.makeSound();
        lion.sleeps();
        Cow cow = new Cow();
        cow.eats();
        cow.makeSound();
        cow.sleeps();
        System.out.println("\n***** Builder Pattern *****");
        House house = new House(true, true, true, false, false, true);
        house.detailsOfHouse();
        System.out.println("\n***** -State Pattern *****");
        Phone phone = new Phone();
        phone.makeCallTo("9294097012");
        System.out.println("\n***** Proxy Pattern *****");
        Client client = new Client();
        client.connectTo("instagram.com");
        client.connectTo("geeksforgeeks.com");
        System.out.println("\n***** Chain Of Responsibilites Pattern *****");
        Login login = new Login("asd","asd123");
        login = new Login("ram","ram111");
        
    }
}
