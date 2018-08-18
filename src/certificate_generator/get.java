package certificate_generator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class get extends JFrame implements MouseListener, MouseMotionListener{

	private JPanel contentPane;
	int x,y,a,b,n,m,count=1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Image img = new ImageIcon("resources/certi.jpeg").getImage();
					get frame = new get();
					frame.setSize(new Dimension(img.getWidth(null)+20, img.getHeight(null)+50));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public get() {
		addMouseListener(this);
	    addMouseMotionListener(this);
		ImageIcon img = new ImageIcon("resources/certi.jpeg");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0,0,0,0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(img);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		JOptionPane.showMessageDialog(contentPane,"Please select the region where name is to be entered.","Message",
				JOptionPane.QUESTION_MESSAGE);
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		n = arg0.getX();
		m = arg0.getY();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(count==1){
		x = arg0.getX();
		y = arg0.getY();
		}
		else if(count==2)
		{
			n = arg0.getX();
			m = arg0.getY();
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(count==1)
		{
			a = arg0.getX();
			b = arg0.getY();
			JOptionPane.showMessageDialog(contentPane,"Please select the region where number is to be entered.","Message",
					JOptionPane.QUESTION_MESSAGE);
		}
		else if(count==2){
		try {
			mainClass obj = new mainClass(x,y,a,b,n,m-20);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		count++;
	}

}
