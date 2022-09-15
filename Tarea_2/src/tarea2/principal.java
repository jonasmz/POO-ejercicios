package tarea2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class principal {
	public static persona persona1;
	public static JLabel nombre;
	public static JLabel apellido;
	public static JLabel dni;
	public static JLabel domicilio;
	public static JLabel telefono;
	

	public static void main(String[] args) {
		persona1 = new persona("Marcos", "Dietz", 11111111, "Avenida siempreviva 742", "764-84377");
		
		JFrame f = new JFrame("Ejercicio 2");
		f.setSize(450, 450);
		
		JPanel p = new JPanel(null);
		
		JButton botonMostrar = new JButton("Mostrar datos");
		botonMostrar.setBounds(50, 50, 150, 25);
		botonMostrar.addActionListener(new mostrar());
		f.add(p);
		p.add(botonMostrar);
		
		nombre = new JLabel();
		apellido = new JLabel();
		dni = new JLabel();
		domicilio = new JLabel();
		telefono = new JLabel();
		
		nombre.setBounds(50, 100, 150, 25);
		apellido.setBounds(50, 130, 150, 25);
		dni.setBounds(50, 160, 150, 25);
		domicilio.setBounds(50, 190, 150, 25);
		telefono.setBounds(50, 220, 150, 25);
		
		p.add(nombre);
		p.add(apellido);
		p.add(dni);
		p.add(domicilio);
		p.add(telefono);
		
		f.setVisible(true);
	}

}

class mostrar implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		principal.nombre.setText(principal.persona1.getNombre());
		principal.apellido.setText(principal.persona1.getApellido());
		principal.dni.setText(principal.persona1.getDni().toString());
		principal.domicilio.setText(principal.persona1.getDomicilio());
		principal.telefono.setText(principal.persona1.getTelefono());
		
	}
	
}
