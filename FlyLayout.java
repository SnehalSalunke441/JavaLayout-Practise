import java.awt.*;
public class FlyLayout extends Frame
{
 FlyLayout()
 {
  Button b1 = new Button("OK");
  Button b2 = new Button("CLICK");
  Button b3 = new Button("SUBMIT");
  Button b4 = new Button("CANCEL");
  Frame fr = new Frame();
  fr.setLayout(new FlowLayout());
  fr.add(b1);
  fr.add(b2);
  fr.add(b3);
  fr.add(b4);
  fr.setSize(400,500);
  fr.setVisible(true);
 }
 public static void main(String args[])
 {
  FlyLayout obj = new FlyLayout();
 }
}