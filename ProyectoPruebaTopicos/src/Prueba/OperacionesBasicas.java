package Prueba;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

class OperacionesBasicas extends PantallaGUI{
	
	private JButton basicas[];
	protected JPanel conten;
	private JPanel panel;

	public OperacionesBasicas(){
		setSize(600,500);
		setTitle("Calculadora Estándar");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		diseñar();
		crearBotones();
		setVisible(true);
	}
	
	void diseñar(){
		panel = new JPanel();
        panel.setLayout(new BorderLayout());
        conten=new JPanel();
        panel.add(conten,BorderLayout.CENTER);
        getContentPane().add(panel);
	}
	
	
	void crearBotones(){
        
		basicas=new JButton[14];
		
		basicas[0]=new JButton("1");
		basicas[1]=new JButton("2");
		basicas[2]=new JButton("3");
		basicas[3]=new JButton("+");
		basicas[4]=new JButton("4");
		basicas[5]=new JButton("5");
		basicas[6]=new JButton("6");
		basicas[7]=new JButton("-");
		basicas[8]=new JButton("7");
		basicas[9]=new JButton("8");
		basicas[10]=new JButton("9");
		basicas[11]=new JButton("*");
		basicas[12]=new JButton("0");
		basicas[13]=new JButton("/");
		basicas[14]=new JButton("=");
		
	     for(int i=0;i<14;i++){
	            conten.add(basicas[i]);
	            if(!basicas[i].getText().equals("")){
	            basicas[i].addActionListener(this);
	            }
	            
	        }
		
	}

	


}
