package Examen1;

import java.io.InputStream;
import java.util.Scanner;
import java.nio.charset.StandardCharsets;

public class Principal {
//calculadora
	private final static Menu MENU = new Menu();

	public static void main(final String[] args) {

		int seleccionMenu = 0;
		boolean ciclar = true;
		Scanner escoger = null;
		String SeleccionarOperacion = null;
		
		try {
			do {
				MENU.inicio();
					try {
						escoger = new Scanner (System.in, StandardCharsets.UTF_8.name());
						seleccionMenu = escoger.nextInt();
						boolean ciclar2 = false;
				
						switch (escoger) {
						case 1:
							do {
								MENU.EnumOperaciones();
							
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
