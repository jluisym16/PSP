package ejercicios.unidad1.actividad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Suma {

		/*
		 * Una variable de clase por defecto se inicializan con null
		 */
	private static String linea;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		try {
		System.out.println("Número 1: ");
		linea = br.readLine();
		double n1 = Double.parseDouble(linea);
		System.out.println("Número 2: ");
		linea= br.readLine();
		double n2 = Double.parseDouble(linea);
		System.out.printf("%f + %f= %f\n", n1,n2,n1+n2);
		}catch (NumberFormatException e) {
			System.err.printf("error %s no es un número", linea);
			System.exit(-1);
		}
	}

}
