import java.awt.*;
import javax.swing.*;
public class Frameprogram1
{
 public Frameprogram1()
 {
  JLabel name, acc, type, gender;
  JTextField t1,t2;
  name = new JLabel("Name of customer: ");
  name.setBounds(50,50,150,30);
  acc = new JLabel("Account no.:");
  acc.setBounds(50,100,150,30);
  t1 = new JTextField("");
  t1.setBounds(200,50,150,30);
  t2 = new JTextField("");
  t2.setBounds(200,100,150,30);
  type = new JLabel("Type of Account:");
  type.setBounds(50,150,150,30);
  Choice c = new Choice();
  c.setBounds(200,150, 75,75);
  c.add("Savings");
  c.add("Current");
  gender = new JLabel("Gender:");
  gender.setBounds(50,200,150,30);
  JRadioButton b1 = new JRadioButton("Male");
  JRadioButton b2 = new JRadioButton("Female");
  b1.setBounds(200,200,150,30);
  b2.setBounds(200,250,150,30);
  Button b = new Button("Submit");
  b.setBounds(100,300,100,60);
  JFrame fr = new JFrame("Bank");
  fr.add(name); fr.add(t1);
  fr.add(acc); fr.add(t2);
  fr.add(type); fr.add(c);
  fr.add(gender); fr.add(b1); fr.add(b2);
  fr.add(b);
  fr.setSize(400,500);
  fr.setLayout(null);
  fr.setVisible(true);
 }
 public static void main(String args[])
 {
  Frameprogram1 obj = new Frameprogram1();
 }
}
