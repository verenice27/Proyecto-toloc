package Prueba;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class PantallaGUI extends JFrame implements ActionListener{
	
	private  JPanel principal;
	private JButton estandar;
	private JButton cientifica;
	
	OperacionesBasicas ob;
	OperacionesComplejas oc;

	public PantallaGUI(){
		setSize(600,200);
		setTitle("TOLOC");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		init();
		setVisible(true);
	}
	
	
	void init(){
		estandar=new JButton("Estándar");
		estandar.addActionListener(this);
		cientifica=new JButton("Científica");
		cientifica.addActionListener(this);
		Container c=getContentPane();
		   c.setLayout(new FlowLayout());
		   c.add(estandar);
		   c.add(cientifica);   
	}
	
	
	public static void main(String[] args) {
		new PantallaGUI();
		
	}


	public void actionPerformed(ActionEvent e) {
		JButton selec = (JButton)e.getSource();
		String clic= selec.getText();
		if(clic.equals("Estándar")){
			new OperacionesBasicas();
		}else{
			new OperacionesComplejas();
		}
			
	}

}
