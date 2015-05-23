package Prueba;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
 
class OperacionesComplejas extends OperacionesBasicas{
	
	private JButton complejas[];
	private JPanel  cont;
	private JPanel pant;
	
	public OperacionesComplejas(){
		setSize(600,500);
		setTitle("Calculadora Estándar");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	void continuar(){
		pant = new JPanel();
        pant.setLayout(new BorderLayout());
        cont=new JPanel();
        pant.add(conten,BorderLayout.WEST);
        pant.add(cont,BorderLayout.EAST);
        getContentPane().add(pant);
		
	}
	
	void completar(){
		complejas=new JButton[7];
		
		
		complejas[0]=new JButton("raiz");
		complejas[1]=new JButton("potencia");
		complejas[2]=new JButton("sin");
		complejas[3]=new JButton("cos");
		complejas[4]=new JButton("tan");
		complejas[5]=new JButton("secante");
		complejas[6]=new JButton("cosecante");
		complejas[7]=new JButton("tangente");
		
		for(int i=0;i<7;i++){
			 cont.add(complejas[i]);
	            if(!complejas[i].getText().equals("")){
	            complejas[i].addActionListener(this);
	            }
		}

	}


}
