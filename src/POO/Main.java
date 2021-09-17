package src.POO;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Item tuna =new Item();
        tuna.name="Atun Gomez";
        tuna.price=180.0;
        tuna.expiratinDate = new Date(2021,8,12);
        tuna.calculateTax();

        if (tuna.canItBeSold()) {
            System.out.println("nombre del Item: " + tuna.name);

            System.out.println("precio del Item: " + tuna.price);
            System.out.println("impuesto del Item: " + tuna.tax);
            System.out.println("total a pagar por  el Item: " + tuna.getTotalToPay());
        }else {
            System.out.println("este Item no esta habilitado");
        }
    }
}
