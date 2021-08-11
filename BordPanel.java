import java.awt.*;
import javax.swing.*;
public class BordPanel extends Frame
{
 BordPanel()
 {
  Button b1 = new Button("SIGN UP");
  Button b2 = new Button("LOGIN");
  Button b3 = new Button("BACK");
  Button b4 = new Button("NEXT");
  Button b5 = new Button("HELLO");
  Panel p1 = new Panel();
  Panel p2 = new Panel();
  Frame fr = new Frame();
  p1.add(b1);
  p1.add(b2);
  fr.add(p1, BorderLayout.NORTH);
  fr.add(b5, BorderLayout.CENTER);
  p2.add(b3);
  p2.add(b4);
  fr.add(p2, BorderLayout.SOUTH);
  fr.setSize(400,500);
  fr.setVisible(true);
 }
 public static void main(String args[])
 {
  BordPanel obj = new BordPanel();
 }
}