package application;

import application.entities.Client;

public class App {
    public static void main (String [] args) {
        System.out.println("Mensagem de teste");
        System.out.println("Novo commit");

        Client c = new Client(1, "Ana");
        System.out.print(c);

        Client c1 = new Client(2, "Ana Clara");
        System.out.print(c1);
    }
}
