package paintApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class paint extends JPanel implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = -4586496091162299825L;

	// Default Color
	private static Color defaultColor = Color.BLACK;

	// Coordinates of mouse
	private int prevX;
	private int prevY;
	private int currentX;
	private int currentY;

	// Eraser Boolean
	private boolean eraser;

	// Boolean to determine if mouse id being dragged
	private boolean mouseDrag = true;

	// Universal Graphics variable
	private Graphics g;

	public static void main(String[] args) {

		// Making JFrame where drawing will be done

		JFrame window = new JFrame("Swiss Knife Paint App");

		window.setContentPane( new paint() );
		window.setSize(500, 500);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
	}

	// Constructor
	public paint() {

		setBackground(Color.WHITE);
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setBorder( BorderFactory.createLineBorder(Color.BLACK, 7) );
	}

	// Default Color Setting Method
	public void setColor() {

		g = getGraphics();

		g.setColor(defaultColor);
	}

	// Making Palate
	public void paintComponent(Graphics g) {

		int x = getX(); // X of Panel
		int y = getY(); // Y of Panel

		super.paintComponent(g);
		
		// Setting Iconic Background for Swiss Knife
		
		Graphics2D g2d = (Graphics2D) g;
		
		ImageIcon ic = new ImageIcon("E:/Swiss Knife/paint/sn2.png");
		Image i = ic.getImage();
		g2d.drawImage(i, 0, 0, null);
		
		// Setting the task
		
		g2d.setFont( new Font( "Serif" , Font.ITALIC, 25) );
		g2d.drawString("Swiss Knife Paint Challenge!", 80, 35);
		g2d.drawString("Do Not Use Eraser! :D", 110, 60);

		// Drawing the color palate

		g.setColor(Color.RED);
		g.fillRect(x+450, y, 50, 50);

		g.setColor(Color.BLUE);
		g.fillRect(x+450, y+50, 50, 50);

		g.setColor(Color.GREEN);
		g.fillRect(x+450, y+100, 50, 50);

		g.setColor(Color.GRAY);
		g.fillRect(x+450, y+150, 50, 50);

		g.setColor(Color.BLACK);
		g.fillRect(x+450, y+200, 50, 50);

		g.setColor(Color.YELLOW);
		g.fillRect(x+450, y+250, 50, 50);

		g.setColor(Color.ORANGE);
		g.fillRect(x+450, y+300, 50, 50);

		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(x+450, y+350, 50, 50);

		g.setColor(Color.BLACK);
		g.drawRect(x+450, y+400, 50, 50);
		g.setFont( new Font("Serif", Font.BOLD, 12) );
		g.drawString("Eraser" , x+455, y+430);

		
		// Adding borders for decoration
		// Work In Progress

		g.setColor(Color.BLACK);
		g.fill3DRect(0, 0, 4, 500, true);
		g.fill3DRect(0, 0, 500, 4, true);
		g.fill3DRect(491, 0, 4, 500, true);
		g.fill3DRect(0, 450, 500, 15, true);
		g.fill3DRect(450, 0, 4, 500, true);
		

	}

	public void mousePressed(MouseEvent evt) {

		int x = evt.getX();
		int y = evt.getY();

		// Determine if user is in drawing area

		if (x<451)
			mouseDrag = true;

		// Making Color Chooser

		// Determine if user's mouse is in palate
		if (x>=450) {
			if (y<50) { // Selecting Color
				defaultColor=Color.RED;
				eraser = false;
			}
			else if (y>50 && y<100) {
				defaultColor=Color.BLUE;
				eraser = false;
			}
			else if (y>100 && y<150) {
				defaultColor=Color.GREEN;
				eraser = false;
			}
			else if (y>150 && y<200) {
				defaultColor=Color.GRAY;
				eraser = false;
			}
			else if (y>200 && y<250) {
				defaultColor=Color.BLACK;
				eraser = false;
			}
			else if (y>250 && y<300) {
				defaultColor=Color.YELLOW;
				eraser = false;
			}
			else if (y>300 & y<350) {
				defaultColor=Color.ORANGE;
				eraser = false;
			}
			else if (y>350 && y<400) {
				defaultColor=Color.LIGHT_GRAY;
				eraser = false;
			}
			else if (y>400 && y<500) {
				defaultColor=Color.WHITE;
				eraser = true;
			}
		}


		// Coordinates for mouse dragging motion
		prevX = x;
		prevY = y;

	}

	public void mouseDragged(MouseEvent evt) {
		
//		InputStream in = null;
//		try{
//			in = new FileInputStream("E:/Swiss Knife/paint/scribbleFinal.wav");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		AudioStream as = null;
//		try{
//			as = new AudioStream(in);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		AudioPlayer.player.start(as);

		int x = evt.getX();
		int y = evt.getY();

		if (mouseDrag) { // Checking mouse Dragging

			if (x>450 || y>450 || x<4 || y<4) // Also for checking if user is in drawing area
				return;

			// Adding Eraser
			if (eraser) {
				g.fillOval(x-51, y-51, 50, 50);
			}

			// Drawing Line conditions

			// Setting color
			setColor();

			currentX = x;
			currentY = y;


			g.drawLine(prevX, prevY, currentX, currentY);

			prevX = currentX;
			prevY = currentY;

			if (x>450)
				mouseDrag = false;
		}


		/*
		// Showing point of mouse
		Point p = evt.getPoint();
		showStatus("Points:" + p);
		 */

		//g.dispose();

	}

	public void mouseReleased(MouseEvent evt) {

		mouseDrag = false;

		prevX = evt.getX();
		prevY = evt.getY();

		g.dispose();

	}

	// Unused mouse events

	public void mouseMoved(MouseEvent evt) { }

	public void mouseClicked(MouseEvent evt) { }

	public void mouseEntered(MouseEvent evt) {	}

	public void mouseExited(MouseEvent evt) { }

}
