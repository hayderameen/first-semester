package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScientificCalculator extends JPanel implements ActionListener {

	private static final long serialVersionUID = 7040676942843425575L;

	// Two text fields for two numbers input
	public JTextField xField, yField, symbolField;

	// JLabel displaying result
	public JLabel result;

	// Numbers Buttons to display
	public JButton one, two, three, four, five,
	six, seven, eight, nine, zero, decimal;

	// Buttons for arithmetic operations
	public JButton equal, minus, plus, multiply, divide,
	sqrRoot, pi, sqr, cube, power, sin, cos, tan, oneByX,
	aCos, aTan, aSin, factorial, absolute, log, log10, x10x,
	toRad, toDegree;

	// Random Buttons
	public JButton clear;

	// For equals operation
	public String prevAction;

	// Two numbers and result in double
	public double xNumber, yNumber, finalResult;

	// String to display inputs in textfields using mouse
	public String xCurrentDisplay = "", yCurrentDisplay = "",
			xPrevDisplay = "", yPrevDisplay = "";

	// Class for listener of xField for number buttons
	private class xListener implements ActionListener, FocusListener {

		private boolean xFieldType = false;

		public void actionPerformed(ActionEvent evt) {

			String action = evt.getActionCommand();

			xField.setText(xCurrentDisplay);
			yField.setText(yCurrentDisplay);

			xField.addFocusListener(this);
			yField.addFocusListener(this);

			if ( action == "1") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

			if ( action == "2") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

			if ( action == "3") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

			if ( action == "4") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

			if ( action == "5") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

			if ( action == "6") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

			if ( action == "7") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

			if ( action == "8") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

			if ( action == "9") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

			if ( action == "0") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

			if ( action == ".") {

				if (xFieldType) {
					xCurrentDisplay = xPrevDisplay + action;
					xField.setText(xCurrentDisplay);
					xPrevDisplay = xCurrentDisplay;
				}

				else {
					yCurrentDisplay = yPrevDisplay + action;
					yField.setText(yCurrentDisplay);
					yPrevDisplay = yCurrentDisplay;
				}
			}

		}

		public void focusGained(FocusEvent evt) {

			if (xField.hasFocus()) {
				xFieldType = true;
			}

			if (yField.hasFocus()) {
				xFieldType = false;
			}

		}

		public void focusLost(FocusEvent arg0) {


		}


	}

	public static void main(String[] args) {

		JFrame window = new JFrame("Scientific Calculator - SwissKnife");

		ScientificCalculator content = new ScientificCalculator();

		window.setContentPane( content );
		window.setSize(630, 450);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(true);
		window.setVisible(true);

	}

	// Constructor of main class
	public ScientificCalculator() {

		// Making object of xField mouse Listener for number buttons
		xListener xlistener = new xListener();

		// Setting gray color as main background
		setBackground(Color.LIGHT_GRAY);

		/*
		 * Making JPanel of X and Y text fields
		 * in the top and setting layout using
		 * Grid layout pattern.
		 */

		JPanel XYPanel = new JPanel();
		XYPanel.setLayout( new GridLayout(0,3, 5, 0) );
		XYPanel.setBorder( BorderFactory.createLineBorder(Color.BLACK, 1));

		xField = new JTextField("0.0" , 20);
		xField.add( new JLabel("X = ") );
		xField.setPreferredSize( new Dimension(50,50) );
		xField.setFont( new Font("Serif" , Font.ITALIC, 30) );
		xField.setBorder( BorderFactory.createLineBorder(Color.BLACK, 1));
		yField = new JTextField("0.0" , 20);
		yField.add( new JLabel("Y = ") );
		yField.setPreferredSize( new Dimension(50,50) );
		yField.setFont( new Font("Serif" , Font.ITALIC, 30) );
		yField.setBorder( BorderFactory.createLineBorder(Color.BLACK, 1));

		symbolField = new JTextField(2);
		symbolField.setPreferredSize( new Dimension(50,50) );
		symbolField.setFont( new Font("Serif" , Font.ITALIC, 30) );
		symbolField.setBorder( BorderFactory.createLineBorder(Color.BLACK, 1));
		symbolField.setEditable(false);
		symbolField.setText("      Symbol");
		
		XYPanel.add(xField);
		XYPanel.add(symbolField);
		XYPanel.add(yField);


		/*
		 * Making JPanel for displaying result
		 * It will be a JLabel to make it larger.
		 */

		result = new JLabel();
		result.setText("Result =      ");
		result.setBackground(Color.WHITE);
		result.setForeground(Color.BLACK);
		result.setPreferredSize( new Dimension(50, 50) );
		result.setFont( new Font("Serif" , Font.ITALIC , 30) );
		result.setOpaque(true);

		/*
		 * Making Panel of Number Buttons
		 */

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout( new GridLayout(7,5,5, 5) );

		// Making number buttons

		one = new JButton("1");
		one.setFont( new Font("Serif", Font.BOLD, 30) );
		one.setBackground(Color.WHITE);
		one.addActionListener(xlistener);

		two = new JButton("2");
		two.setFont( new Font("Serif", Font.BOLD, 30) );
		two.setBackground(Color.WHITE);
		two.addActionListener(xlistener);

		three = new JButton("3");
		three.setFont( new Font("Serif", Font.BOLD, 30) );
		three.setBackground(Color.WHITE);
		three.addActionListener(xlistener);

		four = new JButton("4");
		four.setFont( new Font("Serif", Font.BOLD, 30) );
		four.setBackground(Color.WHITE);
		four.addActionListener(xlistener);

		five = new JButton("5");
		five.setFont( new Font("Serif", Font.BOLD, 30) );
		five.setBackground(Color.WHITE);
		five.addActionListener(xlistener);

		six = new JButton("6");
		six.setFont( new Font("Serif", Font.BOLD, 30) );
		six.setBackground(Color.WHITE);
		six.addActionListener(xlistener);

		seven = new JButton("7");
		seven.setFont( new Font("Serif", Font.BOLD, 30) );
		seven.setBackground(Color.WHITE);
		seven.addActionListener(xlistener);

		eight = new JButton("8");
		eight.setFont( new Font("Serif", Font.BOLD, 30) );
		eight.setBackground(Color.WHITE);
		eight.addActionListener(xlistener);

		nine = new JButton("9");
		nine.setFont( new Font("Serif", Font.BOLD, 30) );
		nine.setBackground(Color.WHITE);
		nine.addActionListener(xlistener);

		zero = new JButton("0");
		zero.setFont( new Font("Serif", Font.BOLD, 30) );
		zero.setBackground(Color.WHITE);
		zero.addActionListener(xlistener);

		decimal = new JButton(".");
		decimal.setFont( new Font("Serif", Font.BOLD, 30) );
		decimal.setBackground(Color.WHITE);
		decimal.addActionListener(xlistener);

		equal = new JButton("=");
		equal.setFont( new Font("Serif", Font.BOLD, 50) );
		equal.setBackground(Color.RED);
		equal.setForeground(Color.WHITE);
		equal.setEnabled(true);
		equal.addActionListener(this);

		minus  = new JButton("-");
		minus.setFont( new Font("Serif", Font.BOLD, 50) );
		minus.setBackground(Color.GRAY);
		minus.setForeground(Color.WHITE);
		minus.addActionListener(this);

		plus = new JButton("+");
		plus.setFont( new Font("Serif", Font.BOLD, 40) );
		plus.setBackground(Color.GRAY);
		plus.setForeground(Color.WHITE);
		plus.addActionListener(this);

		multiply = new JButton("*");
		multiply.setFont( new Font("Serif", Font.BOLD, 40) );
		multiply.setBackground(Color.GRAY);
		multiply.setForeground(Color.WHITE);
		multiply.addActionListener(this);

		divide = new JButton("÷");
		divide.setFont( new Font("Serif", Font.BOLD, 40) );
		divide.setBackground(Color.GRAY);
		divide.setForeground(Color.WHITE);
		divide.addActionListener(this);

		sqrRoot = new JButton("√");
		sqrRoot.setFont( new Font("Serif", Font.BOLD, 30) );
		sqrRoot.setBackground(Color.GRAY);
		sqrRoot.setForeground(Color.WHITE);
		sqrRoot.addActionListener(this);

		sqr = new JButton("x^2");
		sqr.setFont( new Font("Serif", Font.BOLD, 30) );
		sqr.setBackground(Color.GRAY);
		sqr.setForeground(Color.WHITE);
		sqr.addActionListener(this);

		cube = new JButton("x^3");
		cube.setFont( new Font("Serif", Font.BOLD, 30) );
		cube.setBackground(Color.GRAY);
		cube.setForeground(Color.WHITE);
		cube.addActionListener(this);

		power = new JButton("x^y");
		power.setFont( new Font("Serif", Font.BOLD, 30) );
		power.setBackground(Color.GRAY);
		power.setForeground(Color.WHITE);
		power.addActionListener(this);

		pi = new JButton("\u03c0");
		pi.setFont( new Font("Serif", Font.BOLD, 30) );
		pi.addActionListener(this);

		sin = new JButton("sin(x)");
		sin.setFont( new Font("Serif", Font.BOLD, 20) );
		sin.setBackground(Color.BLUE);
		sin.setForeground(Color.WHITE);
		sin.addActionListener(this);

		cos = new JButton("cos(x)");
		cos.setFont( new Font("Serif", Font.BOLD, 20) );
		cos.setBackground(Color.BLUE);
		cos.setForeground(Color.WHITE);
		cos.addActionListener(this);

		tan = new JButton("tan(x)");
		tan.setFont( new Font("Serif", Font.BOLD, 20) );
		tan.setBackground(Color.BLUE);
		tan.setForeground(Color.WHITE);
		tan.addActionListener(this);

		clear = new JButton("AC");
		clear.setFont( new Font("Serif", Font.BOLD, 30) );
		clear.setBackground(Color.ORANGE);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);

		oneByX = new JButton("1/x");
		oneByX.setFont( new Font("Serif", Font.BOLD, 30) );
		oneByX.setBackground(Color.GRAY);
		oneByX.setForeground(Color.WHITE);
		oneByX.addActionListener(this);

		aSin = new JButton("aSin(x)");
		aSin.setFont( new Font("Serif", Font.BOLD, 18) );
		aSin.setBackground(Color.BLUE);
		aSin.setForeground(Color.WHITE);
		aSin.addActionListener(this);

		aCos = new JButton("aCos(x)");
		aCos.setFont( new Font("Serif", Font.BOLD, 18) );
		aCos.setBackground(Color.BLUE);
		aCos.setForeground(Color.WHITE);
		aCos.addActionListener(this);

		aTan = new JButton("aTan(x)");
		aTan.setFont( new Font("Serif", Font.BOLD, 18) );
		aTan.setBackground(Color.BLUE);
		aTan.setForeground(Color.WHITE);
		aTan.addActionListener(this);

		factorial = new JButton("!(x)");
		factorial.setFont( new Font("Serif", Font.BOLD, 25) );
		factorial.setBackground(Color.GRAY);
		factorial.setForeground(Color.WHITE);
		factorial.addActionListener(this);

		absolute = new JButton("| x |");
		absolute.setFont( new Font("Serif", Font.BOLD, 30) );
		absolute.setBackground(Color.GRAY);
		absolute.setForeground(Color.WHITE);
		absolute.addActionListener(this);

		log = new JButton("log(x)");
		log.setFont( new Font("Serif", Font.BOLD, 22) );
		log.setBackground(Color.GRAY);
		log.setForeground(Color.WHITE);
		log.addActionListener(this);

		log10 = new JButton("log10(x)");
		log10.setFont( new Font("Serif", Font.BOLD, 22) );
		log10.setBackground(Color.GRAY);
		log10.setForeground(Color.WHITE);
		log10.addActionListener(this);

		x10x = new JButton("*10^y");
		x10x.setFont( new Font("Serif", Font.BOLD, 25) );
		x10x.setBackground(Color.GRAY);
		x10x.setForeground(Color.WHITE);
		x10x.addActionListener(this);

		toRad = new JButton("rad(x)");
		toRad.setFont( new Font("Serif", Font.BOLD, 25) );
		toRad.setBackground(Color.GRAY);
		toRad.setForeground(Color.WHITE);
		toRad.addActionListener(this);

		toDegree = new JButton("deg(x)");
		toDegree.setFont( new Font("Serif", Font.BOLD, 25) );
		toDegree.setBackground(Color.GRAY);
		toDegree.setForeground(Color.WHITE);
		toDegree.addActionListener(this);

		// Adding buttons to button panel

		buttonPanel.add(one);
		buttonPanel.add(two);
		buttonPanel.add(three);
		buttonPanel.add(plus);
		buttonPanel.add(sqrRoot);
		buttonPanel.add(four);
		buttonPanel.add(five);
		buttonPanel.add(six);
		buttonPanel.add(minus);
		buttonPanel.add(sqr);
		buttonPanel.add(seven);
		buttonPanel.add(eight);
		buttonPanel.add(nine);
		buttonPanel.add(multiply);
		buttonPanel.add(cube);
		buttonPanel.add(zero);
		buttonPanel.add(decimal);
		buttonPanel.add(equal);
		buttonPanel.add(divide);
		buttonPanel.add(power);
		buttonPanel.add(sin);
		buttonPanel.add(cos);
		buttonPanel.add(tan);
		buttonPanel.add(oneByX);
		buttonPanel.add(clear);
		buttonPanel.add(aSin);
		buttonPanel.add(aCos);
		buttonPanel.add(aTan);
		buttonPanel.add(factorial);
		buttonPanel.add(absolute);
		buttonPanel.add(log);
		buttonPanel.add(log10);
		buttonPanel.add(x10x);
		buttonPanel.add(toRad);
		buttonPanel.add(toDegree);

		/*
		 * Adding all panels to main JPanel
		 */

		setLayout( new BorderLayout(0, 5) );

		add(XYPanel, BorderLayout.NORTH);
		add(result, BorderLayout.PAGE_END);
		add(buttonPanel, BorderLayout.CENTER);

	}

	public void actionPerformed(ActionEvent evt) {

		xNumber = Double.parseDouble( xField.getText() );
		yNumber = Double.parseDouble( yField.getText() );

		// Getting which button is pressed
		String action = evt.getActionCommand();

		/*
		 * Determining plus, minus, multiplication
		 * and division operations.
		 */

		if ( action == "+" ) {
			prevAction = action;
			finalResult = xNumber + yNumber;
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("           +");
		}

		if ( action == "-" ) {
			prevAction = action;
			finalResult = xNumber - yNumber;
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("           -");
		}

		if ( action == "*" ) {
			prevAction = action;
			finalResult = xNumber * yNumber;
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("           *");
		}

		if ( action == "÷" ) {
			prevAction = action;
			finalResult = xNumber / yNumber;
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("           ÷");
		}

		if ( action == "√" ) {
			finalResult = Math.sqrt(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("           √");
		}

		if ( action == "x^2" ) {
			finalResult = xNumber*xNumber;
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("          x^2");
		}

		if ( action == "x^3" ) {
			finalResult = xNumber*xNumber*xNumber;
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("          x^3");
		}

		if ( action == "x^y" ) {
			finalResult = Math.pow(xNumber, yNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("          x^y");
		}

		if ( action == "sin(x)" ) {
			finalResult = Math.sin(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("       sin(x)");
		}

		if ( action == "cos(x)" ) {
			finalResult = Math.cos(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("       cos(x)");
		}

		if ( action == "tan(x)" ) {
			finalResult = Math.tan(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("       tan(x)");
		}

		if ( action == "1/x" ) {
			finalResult = 1/xNumber;
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("         1/x");
		}

		if ( action == "AC" ) {
			xNumber = 0;
			yNumber = 0;
			result.setText("Result = ");
			xField.setText("0.0");
			yField.setText("0.0");
			xPrevDisplay = "";
			yPrevDisplay = "";
			symbolField.setText("      Symbol");
		}

		if ( action == "| x |" ) {

			finalResult=1;

			finalResult = Math.abs(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("         | x |");
		}

		if ( action == "aSin(x)" ) {
			finalResult = Math.asin(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("      aSin(x)");
		}

		if ( action == "aCos(x)" ) {
			finalResult = Math.acos(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("      aCos(x)");
		}

		if ( action == "aTan(x)" ) {
			finalResult = Math.atan(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("      aTan(x)");
		}

		if ( action == "!(x)" ) {

			finalResult=1;

			while (xNumber>0)
				finalResult*=xNumber--;

			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("         !(x)");
		}

		if ( action == "log(x)" ) {
			finalResult = Math.log(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("       log(x)");
		}

		if ( action == "log10(x)" ) {
			finalResult = Math.log10(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("      log10(x)");
		}

		if ( action == "*10^y" ) {
			finalResult = xNumber * Math.pow(10, yNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("       *10^y");
		}

		if ( action == "rad(x)" ) {
			finalResult = Math.toRadians(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("        rad(x)");
		}

		if ( action == "deg(x)" ) {
			finalResult = Math.toDegrees(xNumber);
			result.setText("Result = " + finalResult);
			xField.setText("" + finalResult);
			xNumber = finalResult;
			xPrevDisplay = "" + finalResult;
			yPrevDisplay = "";
			symbolField.setText("        deg(x)");
		}

	}
}