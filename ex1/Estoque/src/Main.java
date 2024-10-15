import entities.Product;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        Product product=new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name:");
        product.name=sc.nextLine();
        System.out.println("Price: ");
        product.price=sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity=sc.nextInt();

        System.out.println();
        System.out.println("Product data: "+product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity=sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: "+product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity= sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: "+product);
        sc.close();
        }
    }
