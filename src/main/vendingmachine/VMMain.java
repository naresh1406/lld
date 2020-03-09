package main.vendingmachine;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ngupta
 * Date: 9/3/2020 AD
 * Time: 22:50
 */
public class VMMain {
    public static void main(String[] args) {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("-------------------------- Welcome to the Vending Machine ---------------------------");

            System.out.println("\nPlease select anyone of the option.");
            System.out.println("1. List all products");
            System.out.println("2. Select product");
            System.out.println("3. Exit");

            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    listAllProducts();
                    break;
                case 3:
                    System.out.println("------------------------------ Exiting Vending Machine ------------------------------");
                    return;
            }


        }
    }

    private static void listAllProducts() {
        List<String> products = Arrays.asList("Chocolate", "Cold-drink", "Candy");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + ". " + products.get(i));
        }
    }
}
