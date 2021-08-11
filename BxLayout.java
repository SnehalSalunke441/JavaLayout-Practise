import java.awt.*;
import javax.swing.*;
public class BxLayout extends Frame
{
 BxLayout()
 {
  Button b1 = new Button("CLICK ME");
  Button b2 = new Button("SUBMIT");
  Button b3 = new Button("CANCEL");
  Frame fr = new Frame();
  fr.setLayout(new BoxLayout(fr, BoxLayout.Y_AXIS));
  fr.add(b1);
  fr.add(b2);
  fr.add(b3);
  fr.setSize(400,500);
  fr.setVisible(true);
 }
 public static void main(String args[])
 {
  BxLayout obj = new BxLayout();
 }
}