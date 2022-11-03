package ejemplos.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Ejemplo1 implements Runnable {
	    public void run() {
	        // Invoked on the event dispatching thread.
	        // Construct...
	    	//Se crea una ventana con un JFrame
	    	JFrame frame = new JFrame("Ejemplo 1 de Swing");
	    	Container c=frame.getContentPane();//Se crea un objeto container 
	    	c.add(new JTextField("Hola Mundo!"), BorderLayout.NORTH);
	    	c.setPreferredSize(new Dimension(500,300));//Se establece el tamaño del contentPane
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//con esto se hace que cuando se pulse la x de cerrar la app, ésta se acabe
	    	frame.pack();//calcula los tamaños
	    	frame.setLocationRelativeTo(null);//para mostrar el programa de swing en mitad de la pantalla
	    	//...and show GUI.
	    	frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Ejemplo1());
	    }
	}

