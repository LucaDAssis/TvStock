package Aplication;

import Entities.Product;
import com.sun.management.UnixOperatingSystemMXBean;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Product Data: ");
        System.out.print("Name: ");
        //aqui estou pegando o nome e guardando no product no campo name.
        String name = sc.nextLine();
        System.out.print("Price: ");
        //pra fixar eim, pegando o price e guarando no product no campo price usando nextDouble
        double price = sc.nextDouble();
        System.out.print("Quantity in Stock: ");
        //pra fixar. pegando o quantity e guaradndo no product no campo quantity usando nextInt
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);
        //só pra pular linha mesmo
        System.out.println();
        //usando o toString parar retorna oque eu alterei, mas posso usar só o productg desde que adicione
        //o toString na minha classe, vou deixar parar fixar melhor.
        System.out.print("Product Data: " + product.toString());

        System.out.println();
        //aqui estamos adicionado o produto
        System.out.print("Enter the number of Products to be add in Stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        //aqui só usei product mas como mudei com o to string já vai
        System.out.print("Updating Data: " + product);

        System.out.println();
        //aqui estamos removendo os produtos
        System.out.print("Enter the number of Products to be Remove in Stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.print("Updating Data: " + product);


        sc.close();
    }
}
