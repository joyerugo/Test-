package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;


public class Main {
    private static List<org.example.Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


while(true) {
    System.out.println("1. Add Product");
    System.out.println("2. Update Product");
    System.out.println("3. Display All Products");
    System.out.println("4. Exit");

    int choice = scanner.nextInt();
    scanner.nextLine();

    switch (choice) {
        case 1:
            addProduct();
            break;
        case 2:
            updateProduct();
            break;
        case 3:
            displayAllProducts();
            break;
        case 4:
            exit();
            break;

    }
}



    }

        private static void addProduct() {
            System.out.println("Enter New Product id");
            String productId = scanner.nextLine();
            System.out.println("Enter New Product name");
            String name = scanner.nextLine();
            System.out.println("Enter New Product price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter New Product quantity");
            int quantity = Integer.parseInt(scanner.nextLine());
            scanner.nextLine();
        }
            private static void updateProduct() {
                System.out.println("Enter New Product id");
                String productId = scanner.nextLine();
                System.out.println("Enter New Product name");
                String name = scanner.nextLine();
                System.out.println("Enter New Product price");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter New Product quantity");
                int quantity = Integer.parseInt(scanner.nextLine());
                scanner.nextLine();

            }

                private static void displayAllProducts() {
                    System.out.println(" List:");
                    System.out.println(" Football\n");


    }
    private static void exit(){
        System.exit(0);
    }
}