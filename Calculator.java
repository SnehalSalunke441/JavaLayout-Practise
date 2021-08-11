import java.awt.*;
//import java.awt.GridLayout;
import javax.swing.*;
public class Calculator extends Frame
{
 Calculator()
 {
  JTextField t1;
  t1 = new JTextField("");
  t1.setBounds(50,50,300,100);

  Button b1 = new Button("1");
   b1.setBounds(50,120,80,150);
  Button b2 = new Button("2");
   b2.setBounds(90,120,120,150);
  Button b3 = new Button("3");
   b3.setBounds(130,120,160,150);
  Button b12 = new Button("+");
   b12.setBounds(170,120,200,150);
  Button b13 = new Button("-");
   b13.setBounds(210,120,240,150);
    
  Button b4 = new Button("4");
   b4.setBounds(50,170,80,200);
  Button b5 = new Button("5");
   b5.setBounds(90,170,120,200);
  Button b6 = new Button("6");
   b6.setBounds(130,170,160,200);
  Button b14 = new Button("*");
   b14.setBounds(170,170,200,200);
  Button b15 = new Button("/");
   b15.setBounds(210,170,240,200);

  Button b7 = new Button("7");
   b7.setBounds(50,220,80,250);
  Button b8 = new Button("8");
   b8.setBounds(90,220,120,250);
  Button b9 = new Button("9");
   b9.setBounds(130,220,160,250);
  Button b16 = new Button("SIN");
   b16.setBounds(170,220,200,250);
  Button b17 = new Button("COS");
   b17.setBounds(210,220,240,250);
    
  Button b10 = new Button("0");
   b10.setBounds(50,270,80,300);
  Button b11 = new Button("=");
   b11.setBounds(90,270,120,300);
  
  Button b18 = new Button("SQRT");
   b18.setBounds(170,270,200,300);
  



  JFrame fr = new JFrame("Calculator");
  fr.add(t1);
  fr.add(b1); fr.add(b2); fr.add(b3); fr.add(b12); fr.add(b13);
  fr.add(b4); fr.add(b5); fr.add(b6); fr.add(b14); fr.add(b15);
  fr.add(b7); fr.add(b8); fr.add(b9); fr.add(b16); fr.add(b17);
  fr.add(b10); fr.add(b11); fr.add(b18);

  fr.setSize(450,450);
  fr.setLayout(null);
  fr.setVisible(true);
 }
 public static void main(String args[])
 {
  Calculator obj = new Calculator();
 }
}