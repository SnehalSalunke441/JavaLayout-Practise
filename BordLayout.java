import java.awt.*;
import java.awt.BorderLayout;
public class BordLayout extends Frame
{
 BordLayout()
 {
  Button b1 = new Button("NORTH");
  Button b2 = new Button("SOUTH");
  Button b3 = new Button("WEST");
  Button b4 = new Button("EAST");
  Button b5 = new Button("CENTRE");
  Frame fr = new Frame();
  fr.setLayout(new BorderLayout());
  fr.add(b1, BorderLayout.NORTH);
  fr.add(b2, BorderLayout.SOUTH);
  fr.add(b3, BorderLayout.WEST);
  fr.add(b4, BorderLayout.EAST);
  fr.add(b5, BorderLayout.CENTER);
  fr.setSize(400,500);
  fr.setVisible(true);
 }
 public static void main(String args[])
 {
  BordLayout obj = new BordLayout();
 }
}