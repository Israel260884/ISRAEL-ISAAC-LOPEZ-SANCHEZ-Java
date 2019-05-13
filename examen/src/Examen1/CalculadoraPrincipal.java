package Examen1;

import java.util.Scanner;

public class CalculadoraPrincipal {

    public static void main(final String[] args) {
        // TODO Auto-generated method stub

        final Scanner ingresarNumero = null;
        final Scanner OperacionAritmetica = null;

        System.out.println("Ingrese un número");
        ingresarNumero = new Scanner(System.in);
        numero1 = ingresarNumero.nextInt();
    }

    public void OperacionAritmetica() {

        System.out.println("Escriba la operación que desea hacer");
        System.out.println("Suma");
        System.out.println("Resta");
        System.out.println("Multiplicacion");
        System.out.println("Division");
        OperacionAritmetica = new Scanner(System.in);

        System.out.println("Ahora ingrese el segundo número");
        ingresarNumero = new Scanner(System.in);
        numero2 = ingresarNumero.nextInt();

    }

}
