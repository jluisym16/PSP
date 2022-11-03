package ejemplos.unidad2;

public class EjemploInterrupt implements Runnable {
public void run() {
	while(!Thread.currentThread().isInterrupted())
		System.out.println("en el hilo");
}
public static void main(String[]args) throws InterruptedException{
	Thread h= new Thread(new EjemploInterrupt());
	h.start();
	Thread.sleep(2000);
	h.interrupt();
	h.join();
	System.out.println("Hilo finalizado");

}
}
