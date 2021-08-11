import java.awt.*;
import java.awt.GridLayout;
public class GriLayout extends Frame
{
 GriLayout()
 {
  Button b1 = new Button("1");
  Button b2 = new Button("2");
  Button b3 = new Button("3");
  Button b4 = new Button("4");
  Button b5 = new Button("5");
  Button b6 = new Button("6");
  Button b7 = new Button("7");
  Button b8 = new Button("8");
  Button b9 = new Button("9");
  Frame fr = new Frame();
  fr.setLayout(new GridLayout(3,3));
  fr.add(b1);
  fr.add(b2);
  fr.add(b3);
  fr.add(b4);
  fr.add(b5);
  fr.add(b6);
  fr.add(b7);
  fr.add(b8);
  fr.add(b9);
  fr.setSize(400,500);
  fr.setVisible(true);
 }
 public static void main(String args[])
 {
  GriLayout obj = new GriLayout();
 }
}