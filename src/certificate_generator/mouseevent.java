package certificate_generator;
import java.awt.*;
import java.awt.event.*;
public class mouseevent extends Frame implements MouseListener, MouseMotionListener
{
  int x, y;
  String str="";
  public mouseevent()
  {
    addMouseListener(this);
    addMouseMotionListener(this);
  }
                          // override MouseListener five abstract methods
  public Pair <Integer, Integer > Pressed(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    Pair <Integer, Integer > p = new Pair<Integer, Integer > (x,y);
	return p;
  }
  public Pair <Integer, Integer > Released(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    Pair <Integer, Integer > p = new Pair<Integer, Integer > (x,y);
	return p;
  }
  public Pair <Integer, Integer > Clicked(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    Pair <Integer, Integer > p = new Pair<Integer, Integer > (x,y);
	return p;
  }
                          // override MouseMotionListener two abstract methods
  public void mouseMoved(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
    Pair <Integer, Integer > p = new Pair<Integer, Integer > (x,y);
  }
  public void mouseDragged(MouseEvent e)
  {
    x = e.getX();
    y = e.getY();
  }
  public static void main(String args[])
  {
    new mouseevent();
  }
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
}