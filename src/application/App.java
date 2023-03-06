package application;

import application.entities.Client;
import application.entities.Product;

public class App {
    public static void main (String [] args) {
        System.out.println("Clientes e Produtos:");

        Client c = new Client(1, "Ana");
        System.out.println(c);

        Client c1 = new Client(2, "Ana Clara");
        System.out.println(c1);

        Client c2 = new Client(3, "Ana Clarice");
        System.out.println(c2);

        Product p = new Product(1, "Laptop", 2.159,1);
        System.out.println(p);

        Product p1 = new Product(2, "Mouse", 1.195,2);
        System.out.println(p1);

    }
}
