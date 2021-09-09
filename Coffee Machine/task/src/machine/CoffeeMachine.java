package machine;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        System.out.println();

        System.out.println("Write how many cups of coffee you will need:");

        int cupsOfCoffee = Integer.parseInt(scanner.next());

        int waterPerCoffee = cupsOfCoffee * 200;
        int milkPerCoffee = cupsOfCoffee * 50;
        int beansPerCoffee = cupsOfCoffee * 15;

        System.out.println("For " + cupsOfCoffee + " cups of coffee you will need:");
        System.out.println(waterPerCoffee + " ml of water");
        System.out.println(milkPerCoffee + " ml of milk");
        System.out.println(beansPerCoffee + " g of coffee beans");


        System.out.println("Write how many ml of water the coffee machine has:");
        int waterInMachine = Integer.parseInt(scanner.next());

        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkInMachine = Integer.parseInt(scanner.next());

        System.out.println("Write how many grams of beans the coffee machine has:");
        int beansInMachine = Integer.parseInt(scanner.next());

        System.out.println("Write how many cups of coffee you will need:");
        int cupsYouNeed = Integer.parseInt(scanner.next());

        int cupsAvailable = Math.min(waterInMachine/200, Math.min(milkInMachine/50, beansInMachine/15));

        if (cupsYouNeed == cupsAvailable){
            System.out.println("Yes, I can make that amount of coffee");
        }
        else if (cupsYouNeed > cupsAvailable){
            System.out.println("No, I can make only " + cupsAvailable + "cup(s) of coffee" );
        }
        else {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (cupsAvailable - cupsYouNeed) + " more than that");
        }



        int water = 400;
        int milk = 540;
        int gBeans = 120;
        int disposableCups = 9;
        int moneyAvailable = 550;

        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(gBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + moneyAvailable + " of money");

        System.out.println("Write action (buy, fill, take)");

        String action = scanner.nextLine();


        switch (action){

            case "buy":
                System.out.println("What do you want to buy? 1 - espresso," +
                        "2 - latte, 3 - cappuccino");
                int typeOfCoffee = Integer.parseInt(scanner.next());
                if (typeOfCoffee == 1) {
                    System.out.println("The coffee machine has:");
                    System.out.println(water - 250 + " ml of water");
                    System.out.println(milk + " ml of milk");
                    System.out.println(gBeans - 16 + " g of coffee beans");
                    System.out.println(disposableCups - 1 + " disposable cups");
                    System.out.println(moneyAvailable + 4 + " of money");
                }
                else if (typeOfCoffee == 2) {
                    System.out.println("The coffee machine has:");
                    System.out.println(water - 350 + " ml of water");
                    System.out.println(milk - 75 + " ml of milk");
                    System.out.println(gBeans - 20 + " g of coffee beans");
                    System.out.println(disposableCups - 1 + " disposable cups");
                    System.out.println(moneyAvailable + 7 + " of money");
                }
                else if (typeOfCoffee == 3){
                    System.out.println("The coffee machine has:");
                    System.out.println(water - 200 + " ml of water");
                    System.out.println(milk - 100 + " ml of milk");
                    System.out.println(gBeans - 12 + " g of coffee beans");
                    System.out.println(disposableCups - 1 + " disposable cups");
                    System.out.println(moneyAvailable + 6 + " of money");
                }
                break;

            case "fill":
                System.out.println("Write how many ml of water you want to add");
                int addedWater = Integer.parseInt(scanner.next());

                System.out.println("Write how many ml of milk you want to add");
                int addedMilk = Integer.parseInt(scanner.next());

                System.out.println("Write how many grams of coffee beans you want to add");
                int addedGBeans = Integer.parseInt(scanner.next());

                System.out.println("Write how many disposable cups of coffee you want to add");
                int addedCups = Integer.parseInt(scanner.next());

                System.out.println("The coffee machine has:");
                System.out.println(water + addedWater + " ml of water");
                System.out.println(milk + addedMilk + " ml of milk");
                System.out.println(gBeans + addedGBeans + " g of coffee beans");
                System.out.println(disposableCups + addedCups + " disposable cups");
                System.out.println(moneyAvailable + " of money");
                break;

            case "take":
                System.out.println("I gave you " + moneyAvailable);
                System.out.println();
                System.out.println("The coffee machine has:");
                System.out.println(water + " ml of water");
                System.out.println(milk + " ml of milk");
                System.out.println(gBeans + " g of coffee beans");
                System.out.println(disposableCups + " disposable cups");
                System.out.println("0" + " of money");
                break;
        }

        //IM stands for InMachine//

        int waterIM = 400;
        int milkIM = 540;
        int gBeansIM = 120;
        int cupsIM = 9;
        int moneyIM = 550;

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            String action = scanner.next();


            if (action.equalsIgnoreCase("buy")) {

                System.out.println("What do you want to buy? 1 - espresso," +
                        " 2 - latte, 3 - cappuccino, back - to main menu");

                String buyAction = scanner.next();

                if (buyAction.equalsIgnoreCase("back")) {
                    continue;
                }
                if (buyAction.equalsIgnoreCase("1")) {

                    if (waterIM >= 250 && gBeansIM >= 16 && cupsIM >= 1) {
                        System.out.println("I have enough resources, making " +
                                "you a coffee!");
                        waterIM -= 250;
                        gBeansIM -= 16;
                        cupsIM -= 1;
                        moneyIM += 4;
                    } else if (waterIM < 250) {
                        System.out.println("Sorry, not enough water!");
                    } else if (gBeansIM < 16) {
                        System.out.println("Sorry, not enough water!");
                    } else {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                }
                if (buyAction.equalsIgnoreCase("2")) {

                    if (waterIM >= 350 && milkIM >= 75 && gBeansIM >= 20 && cupsIM >= 1) {
                        System.out.println("I have enough resources, making " +
                                "you a coffee!");
                        waterIM -= 350;
                        milkIM -= 75;
                        gBeansIM -= 20;
                        cupsIM -= 1;
                        moneyIM += 7;
                    } else if (waterIM < 350) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milkIM < 75) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (gBeansIM < 20) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else {
                        System.out.println("Sorry, not enough disposable cups!");
                    }

                }
                if (buyAction.equalsIgnoreCase("3")) {

                    if (waterIM >= 200 && milkIM >= 100 && gBeansIM >= 12 && cupsIM >= 1) {
                        System.out.println("I have enough resources, making " +
                                "you a coffee!");
                        waterIM -= 200;
                        milkIM -= 100;
                        gBeansIM -= 12;
                        cupsIM -= 1;
                        moneyIM += 6;
                    } else if (waterIM < 200) {
                        System.out.println("Sorry, not enough water!");
                    } else if (milkIM < 100) {
                        System.out.println("Sorry, not enough milk!");
                    } else if (gBeansIM < 12) {
                        System.out.println("Sorry, not enough coffee beans!");
                    } else {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                }

            } else if (action.equalsIgnoreCase("fill")) {
                System.out.println("Write how many ml of water you want to add");
                waterIM += Integer.parseInt(scanner.next());
                System.out.println("Write how many ml of milk you want to add");
                milkIM += Integer.parseInt(scanner.next());
                System.out.println("Write how many g of coffee beans you want to add");
                gBeansIM += Integer.parseInt(scanner.next());
                System.out.println("Write how many disposable cups of coffee you want to add");
                cupsIM += Integer.parseInt(scanner.next());
            } else if (action.equalsIgnoreCase("take")) {
                System.out.println("I gave you $" + moneyIM);
                moneyIM -= moneyIM;
            } else if (action.equalsIgnoreCase("remaining")) {
                System.out.println("The coffee machine has:");
                System.out.println(waterIM + " ml of water");
                System.out.println(milkIM + " ml of milk");
                System.out.println(gBeansIM + " g of coffee beans");
                System.out.println(cupsIM + " disposable cups");
                System.out.println("$" + moneyIM + " of money");
            } else if (action.equalsIgnoreCase("exit")) {
                break;
            }
        }
    }
}