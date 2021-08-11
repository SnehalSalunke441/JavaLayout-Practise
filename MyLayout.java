import java.awt.*;
import java.awt.FlowLayout;
public class MyLayout extends Frame
{
 MyLayout()
 {
  Button b1 = new Button("OK");
  Button b2 = new Button("SUBMIT");
  Frame fr = new Frame();
  fr.setLayout(new FlowLayout());
  fr.add(b1, FlowLayout.LEFT);
  fr.add(b2, FlowLayout.RIGHT);
  fr.setSize(400,500);
  fr.setVisible(true);
 }
 public static void main(String args[])
 {
  MyLayout obj = new MyLayout();
 }
}