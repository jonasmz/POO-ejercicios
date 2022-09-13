package tarea1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class main {

	public static void main(String[] args) {
		JFrame f = new JFrame("aplicacion");
		JPanel p = new JPanel();
		JButton boton = new JButton("Cerrar");
		
		f.setSize(500,500);
		f.add(p);
		p.add(boton);
		f.setVisible(true);
		
		boton.addActionListener(new cerrar());

	}

}

class cerrar implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}
}
