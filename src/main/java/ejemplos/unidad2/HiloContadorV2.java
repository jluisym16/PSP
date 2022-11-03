package ejemplos.unidad2;

public class HiloContadorV2 implements Runnable {
	//ninguna clase que implemente un runnable representa un hilo, aunque lo puede representar
	//Cuando se extiende la clase thread se puede obtener informacion invocando metodos del thread, si no, se ha de invocar al Thread.currentThread y dentro de ahí ya se puede buscar informacion
	/*
	 * en los metodos de instancia el "this" se puede omitir porque los añade automaticamente el compilador
	 */
	@Override
	public void run() {
		for (int contador = 0; contador<=5; contador+=contador)
		System.out.println(Thread.currentThread().getName()+", contador= "+ contador);
	}

}
