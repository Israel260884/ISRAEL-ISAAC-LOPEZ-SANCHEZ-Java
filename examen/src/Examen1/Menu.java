package Examen1;

import java.io.InputStream;
import java.util.Scanner;

public class Menu {

	public static void main(final String[] args) {
        // TODO Auto-generated method stub

        public void ConstructorOperaciones() {


        final Scanner ingresarNumero = null;
        final Scanner OperacionAritmetica = null;

        System.out.println("Ingrese un número");
        ingresarNumero = new Scanner(System.in);
        numero1 = ingresarNumero.nextInt();
    }


        System.out.println("Escriba la operación que desea hacer");
        System.out.println("Suma");
        System.out.println("Resta");
        System.out.println("Multiplicacion");
        System.out.println("Division");
        
        

        switch(OperacionAritmetica){
        case SUMA:
            break;
            
        case RESTA:
            break;
            
        case MULTIPLICACION:
            break;
            
        case DIVISION:
            break;
            
            default:
                System.out.println("No esta escribiendo la operacion correcta");
                break;

        	}

        System.out.println("Ahora ingrese el segundo número");
        ingresarNumero = new Scanner(System.in);
        numero2 = ingresarNumero.nextInt();

    }

}
