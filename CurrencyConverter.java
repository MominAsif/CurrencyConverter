import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        
        
        int currentCurrency;
        int convertingCurrency;
        double amount;

        int usd = 1;
        int euros = 2;
        int rupees = 3;

        Scanner in = new Scanner(System.in);
        System.out.println("This is a currency converter");

        System.out.println("What is your current currency?: ");
        System.out.println("1. US Dollars \n 2. Euros \n 3. Indian Rupees");
        currentCurrency = in.nextInt();

        System.out.println("What currency would you like to convert to?: ");
        System.out.println("1. US Dollars \n 2. Euros \n 3. Indian Rupees");
        convertingCurrency = in.nextInt();

        if(currentCurrency == 1 && convertingCurrency == 2) {
            System.out.println("What is the amount of US Dollars you would like to convert to Euros: ");
            amount = in.nextFloat();
            amount = amount * 1.03;
            System.out.println("Your amount in Euros is: " + amount);
        
        }
    }
}