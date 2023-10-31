package TA21_AdrianGallego.TA21_AdrianGallego;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraVista {

	public JFrame frame;
	private JTextField tfPantalla;
	private double valor1 = 0;
	private double valor2 = 0;
	private String operacion = "";
	String print = "";

	
	//Controla cuando el usuario ha introducido un operador
	private boolean operador = true;
	
	//Controla cuando el usuario ha pulsado el boton de Resultado
	private boolean result = false;


	public CalculadoraVista() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 401, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Calculadora");
		frame.getContentPane().setLayout(null);
		
		tfPantalla = new JTextField();
		tfPantalla.setEditable(false);
		tfPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		tfPantalla.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tfPantalla.setText("0");
		tfPantalla.setBounds(24, 32, 340, 60);
		frame.getContentPane().add(tfPantalla);
		tfPantalla.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(numsClick);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn1.setBounds(25, 266, 70, 70);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(numsClick);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn2.setBounds(114, 266, 70, 70);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(numsClick);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn3.setBounds(205, 266, 70, 70);
		frame.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(numsClick);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn6.setBounds(205, 185, 70, 70);
		frame.getContentPane().add(btn6);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(numsClick);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn4.setBounds(25, 185, 70, 70);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(numsClick);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn5.setBounds(114, 185, 70, 70);
		frame.getContentPane().add(btn5);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(numsClick);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn9.setBounds(205, 104, 70, 70);
		frame.getContentPane().add(btn9);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(numsClick);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn7.setBounds(25, 104, 70, 70);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(numsClick);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn8.setBounds(114, 104, 70, 70);
		frame.getContentPane().add(btn8);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(numsClick);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 30));
		btn0.setBounds(25, 347, 70, 70);
		frame.getContentPane().add(btn0);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(operatorClick);
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnMulti.setBounds(293, 266, 70, 70);
		frame.getContentPane().add(btnMulti);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(operatorClick);
		btnResta.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnResta.setBounds(293, 185, 70, 70);
		frame.getContentPane().add(btnResta);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(operatorClick);
		btnSuma.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSuma.setBounds(293, 104, 70, 70);
		frame.getContentPane().add(btnSuma);
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(operatorClick);
		btnDivision.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDivision.setBounds(293, 347, 70, 70);
		frame.getContentPane().add(btnDivision);
		
		JButton btnResultado = new JButton("=");
		btnResultado.addActionListener(resultado);
		btnResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnResultado.setBounds(205, 347, 70, 70);
		frame.getContentPane().add(btnResultado);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(numsClick);
		btnDecimal.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDecimal.setBounds(114, 347, 70, 70);
		frame.getContentPane().add(btnDecimal);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(del);
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDel.setBounds(205, 428, 158, 70);
		frame.getContentPane().add(btnDel);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(delC);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnC.setBounds(24, 428, 158, 70);
		frame.getContentPane().add(btnC);
	}
	
	/**
	 * 
	 * ActionListener que sera utilizado con los numeros.
	 * 
	 * Se ha utilizado creando una variable button y guardando el evento (que en este caso 
	 * el evento es el boton en el que hemos hecho click), y se guarda en la variable btnPressed.
	 * 
	 * Esta hecho de esta manera para reutilizar el codigo y no hacer un ActionListener por cada numero.
	 * 
	 * */

	ActionListener numsClick = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (operador || result) {
				print = "";
				result = false;
			}
			
			JButton btnPressed = (JButton) e.getSource();
			operador = false;
			print+= btnPressed.getText();
			tfPantalla.setText(print);
			
		}
	};
	
	/**
	 * 
	 * ActionListener que utilizara el boton que muestre el resultado.
	 * 
	 * En la variable resultado se guarda ya el resultado de la operacion 
	 * y lo muestra por el JTextField
	 * 
	 * */
	
	ActionListener resultado = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				valor2 = Double.parseDouble(print);
				double resultado = realizarOperacion(valor1,valor2,operacion);
				print = String.valueOf(resultado);
				tfPantalla.setText(print);
				result = true;
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Introduce el segundo valor!");
			}
			
		}

		
	};
	
	/**
	 * 
	 * ActionListener para los botones de los operadores
	 * 
	 * */
	
	ActionListener operatorClick = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JButton btnPressed = (JButton) e.getSource();
			if (!operador) {
				if (!isDecimal()) {
					valor1 = Double.valueOf(print);
					operacion = btnPressed.getText();
					print=btnPressed.getText();
					tfPantalla.setText(print);
					operador = true;
				}
			}
			
		}
	};
		
	/**
	 * 
	 * ActionListener para el boton borrar.
	 * 
	 * En presionar delete, lo que hara es coger el string actual y quitarle el ultimo caracter
	 * esto se hace con un substring.
	 * 
	 * */
	
	ActionListener del = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (!print.isEmpty()) {
				print = print.substring(0, print.length()-1);
				tfPantalla.setText(print);
			}
		
		}
	};
	
	
	/**
	 * 
	 * ActionListener para el boton 'C'.
	 * 
	 * A diferencia de el boton anterior, este borrara todo la operacion, es decir, si el usuario
	 * ha introducido '2+' le falta introducir el valor2, si pulsa el boton C se borrara todo.
	 * 
	 * */
	
	ActionListener delC = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (!print.isEmpty()) {
				print = "";
				tfPantalla.setText(print);
			}
		
		}
	};
	
	/**
	 * 
	 * Este metodo segun el operador que se le pase por parametro ejecutara una operacion u otra
	 * 
	 * @param valor1 Valor1 para operar
	 * @param valor2 Valor2 para operar
	 * @param operador Esta variable decidira la operacion a realizar
	 * 
	 * */
	public double realizarOperacion(double valor1, double valor2, String operador) {
		double result = 0;
		switch (operador) {
		case "+":
			result = suma(valor1,valor2);
			break;
		case "-":
			result = resta(valor1,valor2);
			break;	
		case "*":
			result = multiplicacion(valor1,valor2);
			break;
		case "/":
			result = division(valor1, valor2);
			break;
		}
		
		return result;
		
	}
	
	/**
	 * Metodo Division
	 * */
	public double division(double valor1, double valor2) {
		return (valor1)/(valor2);
	}

	/**
	 * Metodo multiplicacion
	 * */
	
	public double multiplicacion(double valor1, double valor2) {
		return (valor1)*(valor2);
	}
	
	/**
	 * Metodo suma
	 * */

	public double suma(double valor1, double valor2) {
		return (valor1)+(valor2);
	}
	
	/**
	 * Metodo resta
	 * */

	public double resta(double valor1, double valor2) {
		return (valor1)- (valor2);
	}
	
	/**
	 * Metodo que comprueba si el ultimo caracter introducido es decimal
	 * 
	 * Esto se hace para que, si el usuario introduce por ejemplo '2.' y se olvida de poner el decimal
	 * cuando le vaya a dar a el boton para operar no le deje, de esta manera le obligara a poner el decimal
	 * 
	 * */

	public boolean isDecimal() {
		boolean decimal = false;
		char last = print.charAt(print.length()-1);
		if (last== '.') {
			decimal = true;
		}
		return decimal;
	}
}
