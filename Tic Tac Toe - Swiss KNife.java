package tiktaktoe;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Tic_Tac_Toe extends JPanel implements MouseListener {

	private static final long serialVersionUID = -6323375691926528010L;

	private boolean PlayerX = true;
	private boolean PlayerO = false;

	private boolean gameOver = false;

	private int x1, x2, x3, x4, x5, x6, x7, x8, x9;
	private int o1, o2, o3, o4, o5, o6, o7, o8, o9;

	private int gameCount = 0;

	public static void main(String[] args) throws IOException {

		JFrame window = new JFrame("Tic Tac Toe - SwissKnife");
		window.setContentPane( new Tic_Tac_Toe() );
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(450,450);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);

		JOptionPane.showMessageDialog(null, "Welcome to Game!\n TIC TAC TOE\n" +
				"First Player will use X Symbol..\n" +
				"Second Player will use O Symbol..\n" +
				"Click on any location to place X or O respectively\n" +
				"LETS PLAY!! :D" , "TIC TAC TOE" , JOptionPane.INFORMATION_MESSAGE);

		// Game Opening Sound

		InputStream in = new FileInputStream("E:/Swiss Knife/tiktaktoe/sound.wav");		
		AudioStream as = new AudioStream(in);
		AudioPlayer.player.start(as);

	}

	// Constructor
	public Tic_Tac_Toe() {

		setBackground(Color.WHITE);
		addMouseListener(this);
	}

	// Painting the board with division of boxes
	public void paintComponent(Graphics g) {

		//		GradientPaint gp = new GradientPaint(15f,15f,Color.CYAN,0f,30f,Color.BLUE);

		//		Graphics2D g2 = (Graphics2D) g;

		super.paintComponent(g);

		// Background Image

		Graphics2D g2d = (Graphics2D) g; // For images

		ImageIcon ic = new ImageIcon("E:/Swiss Knife/tiktaktoe/Background.png");
		Image i = ic.getImage();

		g2d.drawImage(i, 10, 11, null);
		
		// The Border
		
		ImageIcon iB = new ImageIcon("E:/Swiss Knife/tiktaktoe/border.png");
		Image B = iB.getImage();

		g2d.drawImage(B, 0, 0, null);

		// Making partitions

		g.setColor(Color.BLUE);
		g.drawRect(145, 0, 5, 450);
		g.drawRect(300, 0, 5, 450);
		g.drawRect(0, 135, 500, 5);
		g.drawRect(0, 285, 500, 5);


	}

	public void mousePressed(MouseEvent evt) {

		// Making object of X Image

		ImageIcon iX = new ImageIcon("E:/Swiss Knife/tiktaktoe/X.png");
		Image X = iX.getImage();
		
		// Making object of O Image
		
		ImageIcon iO = new ImageIcon("E:/Swiss Knife/tiktaktoe/O.png");
		Image O = iO.getImage();

		// Circles and crosses drawing sound
		InputStream in = null;
		try {
			in = new FileInputStream("E:/Swiss Knife/tiktaktoe/drawingSound.wav");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		AudioStream as = null;
		try {
			as = new AudioStream(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

		int x = evt.getX();
		int y = evt.getY();

		Graphics g = getGraphics();
		Graphics2D g2 = (Graphics2D) g;

		g2.setPaint( Color.BLACK ); // Set paint for crosses X's and O's
		g2.setStroke( new BasicStroke(10) ); // Stroke for crosses and O's

		if (gameOver)
			return;

		// COnditions for drawing Crosses!! XX

		if (PlayerX) {

			if (x<150 && y<155) { // First box

				AudioPlayer.player.start(as);

//				g2.draw( new Line2D.Float(20, 20, 120, 120) );
//				g2.draw( new Line2D.Float(120, 20, 20, 120) );

				g2.drawImage(X, 25, 20, null);

				if (x1==0) // It will prevent multiple additions
					x1+=1;
			}

			if (x<300 && x>150 && y<155) { // Second Box

				AudioPlayer.player.start(as);

//				g2.draw( new Line2D.Float(170, 20, 290, 120) );
//				g2.draw( new Line2D.Float(290, 20, 170, 120) );
				
				g2.drawImage(X, 170, 20, null);

				if (x2==0)
					x2+=1;

			}

			if (x>300 && x<450 && y<155) { // third Box

				AudioPlayer.player.start(as);

//				g2.draw( new Line2D.Float(320, 20, 430, 120) );
//				g2.draw( new Line2D.Float(435, 20, 320, 120) );
				
				g2.drawImage(X, 320, 20, null);

				if (x3==0)
					x3+=1;

			}

			if (x<150 && y>155 && y<300) { // fourth Box

				AudioPlayer.player.start(as);

//				g2.draw( new Line2D.Float(20, 170, 120, 270) );
//				g2.draw( new Line2D.Float(120, 170, 20, 270) );
				
				g2.drawImage(X, 20, 170, null);

				if (x4==0)
					x4+=1;
			}

			if (x>150 && x<300 && y>155 && y<300) { // fifth Box

				AudioPlayer.player.start(as);

//				g2.draw( new Line2D.Float(170, 170, 270, 270) );
//				g2.draw( new Line2D.Float(270, 170, 170, 270) );
				
				g2.drawImage(X, 170, 170, null);

				if (x5==0)
					x5+=1;
			}

			if (x>300 && x<450 && y>155 && y<300) { // sixth Box

				AudioPlayer.player.start(as);

//				g2.draw( new Line2D.Float(320, 160, 430, 270) );
//				g2.draw( new Line2D.Float(430, 160, 320, 270) );
				
				g2.drawImage(X, 320, 170, null);

				if (x6==0)
					x6+=1;
			}

			if (x<150 && y>300) { // seventh Box

				AudioPlayer.player.start(as);

//				g2.draw( new Line2D.Float(15, 305, 130, 400) );
//				g2.draw( new Line2D.Float(127, 305, 15, 400) );
				
				g2.drawImage(X, 25, 300, null);

				if (x7==0)
					x7+=1;
			}

			if (x>150 && x<300 && y>300) { // eight Box

				AudioPlayer.player.start(as);

//				g2.draw( new Line2D.Float(165, 305, 280, 400) );
//				g2.draw( new Line2D.Float(280, 305, 165, 400) );
				
				g2.drawImage(X, 165, 300, null);

				if (x8==0)
					x8+=1;
			}

			if (x>300 && y>300) { // ninth Box

				AudioPlayer.player.start(as);

//				g2.draw( new Line2D.Float(320, 305, 425, 400) );
//				g2.draw( new Line2D.Float(425, 305, 320, 400) );
				
				g2.drawImage(X, 320, 300, null);

				if (x9==0)
					x9+=1;

			}// End of crosses drawing

		} // End of PlayerX boolean

		///////////////////////////////////////////////////////////////////////////////////////////////

		// Conditions for drawing O's !! OO

		if (PlayerO) {

			if (x<150 && y<155) { // First box

				AudioPlayer.player.start(as);

//				g2.draw( new Ellipse2D.Float(20, 15, 100, 100));
				
				g2.drawImage(O, 25, 25, null);

				if (o1==0)
					o1+=1;
			}

			if (x<300 && x>150 && y<155) { // Second Box

				AudioPlayer.player.start(as);

//				g2.draw( new Ellipse2D.Float(175, 15, 100, 100));
				
				g2.drawImage(O, 175, 15, null);

				if (o2==0)
					o2+=1;
			}

			if (x>300 && x<450 && y<155) { // third Box

				AudioPlayer.player.start(as);

//				g2.draw( new Ellipse2D.Float(325, 15, 100, 100));
				
				g2.drawImage(O, 325, 15, null);

				if (o3==0)
					o3+=1;
			}

			if (x<150 && y>155 && y<300) { // fourth Box

				AudioPlayer.player.start(as);

//				g2.draw( new Ellipse2D.Float(20, 165, 100, 100));
				
				g2.drawImage(O, 20, 165, null);

				if (o4==0)
					o4+=1;
			}

			if (x>150 && x<300 && y>155 && y<300) { // fifth Box

				AudioPlayer.player.start(as);

//				g2.draw( new Ellipse2D.Float(175, 165, 100, 100));
				
				g2.drawImage(O, 175, 165, null);

				if (o5==0)
					o5+=1;
			}

			if (x>300 && x<450 && y>155 && y<300) { // sixth Box

				AudioPlayer.player.start(as);

//				g2.draw( new Ellipse2D.Float(325, 165, 100, 100));
				
				g2.drawImage(O, 325, 165, null);

				if (o6==0)
					o6+=1;
			}

			if (x<150 && y>300) { // seventh Box

				AudioPlayer.player.start(as);

//				g2.draw( new Ellipse2D.Float(20, 305, 100, 100));
				
				g2.drawImage(O, 20, 305, null);

				if (o7==0)
					o7+=1;
			}

			if (x>150 && x<300 && y>300) { // eight Box

				AudioPlayer.player.start(as);

//				g2.draw( new Ellipse2D.Float(175, 305, 100, 100));
				
				g2.drawImage(O, 175, 305, null);

				if (o8==0)
					o8+=1;
			}

			if (x>300 && y>300) { // ninth Box

				AudioPlayer.player.start(as);

//				g2.draw( new Ellipse2D.Float(325, 305, 100, 100));
				
				g2.drawImage(O, 325, 305, null);

				if (o9==0)
					o9+=1;

			}// End of O's drawing


		} // End of Player O Boolean

	}

	public void mouseReleased(MouseEvent evt) {
		
		Graphics g = getGraphics();
		Graphics2D g2 = (Graphics2D) g;
		
		// The Winning Lines
		
		// Horizontal Line

		ImageIcon iH = new ImageIcon("E:/Swiss Knife/tiktaktoe/H.png");
		Image H = iH.getImage();
		
		// Vertical Line
		
		ImageIcon iV = new ImageIcon("E:/Swiss Knife/tiktaktoe/V.png");
		Image V = iV.getImage();
		
		// Left Cross Line
		
		ImageIcon iL = new ImageIcon("E:/Swiss Knife/tiktaktoe/L.png");
		Image L = iL.getImage();
		
		// Right Cross Line
		
		ImageIcon iR = new ImageIcon("E:/Swiss Knife/tiktaktoe/R.png");
		Image R = iR.getImage();

		// Sound for Winning Condition

		InputStream in = null;
		try {
			in = new FileInputStream("E:/Swiss Knife/tiktaktoe/winningSound.wav");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}		
		AudioStream as = null;
		try {
			as = new AudioStream(in);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Sound for tie Condition

		InputStream in2 = null;
		try{
			in2 = new FileInputStream("E:/Swiss Knife/tiktaktoe/tieSound.wav");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		AudioStream as2 = null;
		try{
			as2 = new AudioStream(in2);
		} catch (IOException e) {
			e.printStackTrace();
		}

		g2.setPaint(Color.BLACK);
		g2.setStroke( new BasicStroke(10) );

		// Counting tries
		gameCount++;

		// This method changes turns

		if (PlayerX) {

			PlayerX = false;
			PlayerO = true;

		}

		else if (PlayerO) {

			PlayerO = false;
			PlayerX = true;

		} // End of method for changing turns

		// Winning Conditions for X's

		if (x1+x2+x3==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(15, 75, 430, 75);
			g2.drawImage(H, 15, 75, null);
			JOptionPane.showMessageDialog(null, "Player X Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (x4+x5+x6==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(15, 220, 430, 220);
			g2.drawImage(H, 15, 220, null);
			JOptionPane.showMessageDialog(null, "Player X Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (x7+x8+x9==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(15, 355, 430, 355);
			g2.drawImage(H, 15, 335, null);
			JOptionPane.showMessageDialog(null, "Player X Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (x1+x4+x7==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(75, 25, 75, 400);
			g2.drawImage(V, 60, 25, null);
			JOptionPane.showMessageDialog(null, "Player X Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (x2+x5+x8==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(220, 25, 220, 400);
			g2.drawImage(V, 210, 25, null);
			JOptionPane.showMessageDialog(null, "Player X Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (x3+x6+x9==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(370, 25, 370, 400);
			g2.drawImage(V, 360, 25, null);
			JOptionPane.showMessageDialog(null, "Player X Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (x1+x5+x9==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(10, 10, 420, 400);
			g2.drawImage(L, 10, 10, null);
			JOptionPane.showMessageDialog(null, "Player X Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (x3+x5+x7==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(420, 10, 10, 400);
			g2.drawImage(R, 10, 10, null);
			JOptionPane.showMessageDialog(null, "Player X Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		//////////////////////////////////////////////////////////////////

		// Winning conditions for O's

		else if (o1+o2+o3==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(15, 75, 430, 75);
			g2.drawImage(H, 15, 75, null);
			JOptionPane.showMessageDialog(null, "Player O Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (o4+o5+o6==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(15, 220, 430, 220);
			g2.drawImage(H, 15, 220, null);
			JOptionPane.showMessageDialog(null, "Player O Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (o7+o8+o9==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(15, 355, 430, 355);
			g2.drawImage(H, 15, 355, null);
			JOptionPane.showMessageDialog(null, "Player O Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (o1+o4+o7==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(75, 25, 75, 400);
			g2.drawImage(V, 60, 25, null);
			JOptionPane.showMessageDialog(null, "Player O Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (o2+o5+o8==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(220, 25, 220, 400);
			g2.drawImage(V, 210, 25, null);
			JOptionPane.showMessageDialog(null, "Player O Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (o3+o6+o9==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(370, 25, 370, 400);
			g2.drawImage(V, 360, 25, null);
			JOptionPane.showMessageDialog(null, "Player O Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (o1+o5+o9==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(10, 10, 420, 400);
			g2.drawImage(L, 10, 10, null);
			JOptionPane.showMessageDialog(null, "Player O Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

		else if (o3+o5+o7==3) {

			AudioPlayer.player.start(as);

			gameOver=true;
//			g2.drawLine(420, 10, 10, 400);
			g2.drawImage(R, 10, 10, null);
			JOptionPane.showMessageDialog(null, "Player O Wins!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}


		// Tie condition

		else if (gameCount==9) {

			AudioPlayer.player.start(as2);

			gameOver=true;
			JOptionPane.showMessageDialog(null, "It's a tie!" , "Game Result" , JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}

	}

	// Unused mouse events

	public void mouseClicked(MouseEvent arg0) {	}

	public void mouseEntered(MouseEvent arg0) {	}

	public void mouseExited(MouseEvent arg0) { }

	// End of unused mouse events

}