package ejercicios.unidad1.actividad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class EjecutaSuma {

	public static void main(String[] args) throws IOException, InterruptedException {
		Process p = Runtime.getRuntime().exec("java -classpath target/classes ejercicios.unidad1.actividad1.Suma");
		try (OutputStream os = p.getOutputStream()) {
			os.write("1\n2\n".getBytes()); // mirar getbytes
			os.flush();
		}
		int estado = p.waitFor();
		if (estado != 0)
			try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()))) {
				String linea;
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
			}
		try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		}

	}

}
