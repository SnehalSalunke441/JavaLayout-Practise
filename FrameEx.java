import java.awt.*;
public class FrameEx extends Frame
{
 public static void main(String args[])
 {
  Label l = new Label("UMIT - SNDT");
  Checkbox c1 = new Checkbox("Male");
  CheckboxGroup cg = new CheckboxGroup();
  Checkbox c2 = new Checkbox("Female", cg, true);
  Choice ch = new Choice();
  ch.addItem("CST");
  ch.addItem("IT");
  Frame fr = new Frame();
  fr.add(l);
  fr.add(c1);
  fr.add(c2);
  fr.add(ch);
  fr.setSize(400,500);
  fr.setVisible(true);
 }
}