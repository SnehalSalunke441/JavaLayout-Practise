import java.awt.*;
public class MyFrame extends Frame
{
 public static void main(String args[])
 {
  Button b1 = new Button("OK");
  Button b2 = new Button("NEXT");
  Frame fr = new Frame("CST");
  fr.add(b1);
  fr.add(b2);
  fr.setSize(400,500);
  fr.setVisible(true);
 }
}