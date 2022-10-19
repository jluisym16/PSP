package ejemplos.unidad2;

public class TestHiloContador {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++)
			new HiloContador(i).start();
//	 Los hilos se ejecutan en orden, aunque por consola se pueden mostrar en un orden distinto porque el planificador le asigna tiempo de manera arbitraria (manera no determinista)

	}
}
