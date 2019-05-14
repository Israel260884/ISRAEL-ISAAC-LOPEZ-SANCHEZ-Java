package Examen1;

import java.io.InputStream;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class Principal {

    public static void main(final String[] args) {

        private final static Menu MENU = new Menu();
		int seleccionMenu = 0;
		boolean ciclar = true;
		EnumOperaciones SeleccionarOperacion = null;
		Double num1 = null;
		Double num2 = null;
		Scanner escoger = null;
		

		try {
			do {
				MENU.inicio();
					try {
						this.escoger = new Scanner (System.in, StandardCharsets.UTF_8.name());
						this.seleccionMenu = this.escoger.nextInt();
						final boolean ciclar2 = false;
						final String operaciones = (String) escoger.next();
					 this.SeleccionarOperacion = EnumOperaciones.valueOf(operaciones.toUpperCase());
						
						switch (this.SeleccionarOperacion) {
						case SUMA:
						    System.out.println("Ingrese el primer digito");
						    final Scanner num1S;
						    num1S.nextDouble();
                            System.out.println("Ingrese el segundo digito");
                            final Scanner num2S;
                            num1S.nextDouble();
                            System.out.println("El resultado de la operacion es" + Calculadora.suma);
                            break;
                            
						case RESTA:
						    System.out.println("Ingrese el primer digito");
                            final Scanner num1R;
                            num1R.nextDouble();
                            System.out.println("Ingrese el segundo digito");
                            final Scanner num2R;
                            num2R.nextDouble();
                            System.out.println("El resultado de la operacion es" + Calculadora.resta);
                            break;
                            
						case MULTIPLICACION:
						    System.out.println("Ingrese el primer digito");
                            final Scanner num1M;
                            num1M.nextDouble();
                            System.out.println("Ingrese el segundo digito");
                            final Scanner num2M;
                            num2M.nextDouble();
                            System.out.println("El resultado de la operacion es" + Calculadora.multipliacion);
                            break;
                            
						case DIVISION:
						    System.out.println("Ingrese el primer digito");
                            final Scanner num1D;
                            num1D.nextDouble();
                            System.out.println("Ingrese el segundo digito");
                            final Scanner num2D;
                            num2D.nextDouble();
                            System.out.println("El resultado de la operacion es" + Calculadora.division);
                            break;
						default:
						    System.err.println("Eso es una opción inválida");
						{
						    
						
					}
						}
							    
						}
					}

			    }
		    }
