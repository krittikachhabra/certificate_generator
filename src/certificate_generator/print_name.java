package certificate_generator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class print_name extends JFrame {

	private static JPanel contentPane;

	final BufferedImage image = ImageIO.read(new File("resources/certi.jpeg"));
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */

	print_name(String name, int i, int x, int y, int a, int b, int n, int m) throws IOException {
		// TODO Auto-generated method stub

	    	String number = "" + i;
		    printSimpleString(name, a-x, x, y);
		    Graphics g = image.getGraphics();
		    g.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		    g.setColor(Color.BLACK);
		    g.drawString(number, n, m);
		    ImageIO.write(image, "jpeg", new File("resources/result"+i+".jpeg"));
		    
		    
	    }
	
	private void printSimpleString(String s, int width, int XPos, int YPos){
        Graphics g2d = image.getGraphics();
	    g2d.setFont(new Font("Times New Roman", Font.PLAIN, 34));
	    g2d.setColor(Color.BLACK);
		int stringLen = (int)g2d.getFontMetrics().getStringBounds(s, g2d).getWidth();
        int start = width/2 - stringLen/2;
        g2d.drawString(s, (start + XPos), YPos);
 }
	
	
}
