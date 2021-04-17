package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Emtre com a quantidade de produtos: ");
        System.out.print("Name: ");
        product.name = leitor.nextLine();

        System.out.print("Preço: ");
        product.price = leitor.nextDouble();

        System.out.println("Quantidade em estoque: ");
        product.quantity = leitor.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Entre com o numero de produtos para ser adicionado no estoque: ");
        int quantity = leitor.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.print("Entre com o numero de produtos para ser removidos no estoque: ");
        quantity = leitor.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);



    }
}
