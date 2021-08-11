import java.awt.*;
import javax.swing.*;
public class Railway
{
 public Railway()
 {
  JLabel head, name, source, destination, date, clas, availability, bookTicket, pay;
  JTextField t1,t2,t3,t4,t5,t6;
  
  head = new JLabel("I R C T C");
  head.setBounds(150, 10, 250, 30);
 
  name = new JLabel("Name of Passenger: ");
  name.setBounds(50,50,150,30);
  t1 = new JTextField("");
  t1.setBounds(200,50,150,30);
  
  source = new JLabel("Source Station: ");
  source.setBounds(50,90,150,30);
  t2 = new JTextField("");
  t2.setBounds(200,90,150,30);
  
  destination = new JLabel("Destination Station: ");
  destination.setBounds(50,130,150,30);
  t3 = new JTextField("");
  t3.setBounds(200,130,150,30);
  
  date = new JLabel("Date: ");
  date.setBounds(50,170,150,30);
  t4 = new JTextField("");
  t4.setBounds(200,170,150,30);

  clas = new JLabel("Class:");
  clas.setBounds(50,210,150,30);
  Choice c = new Choice();
  c.setBounds(200,210, 100,70);
  c.add("First Class");
  c.add("Second Class");

  availability = new JLabel("Availability: ");
  availability.setBounds(50,240,150,30);
  t5 = new JTextField("");
  t5.setBounds(200,240,150,30);
  
  
  bookTicket = new JLabel("Book Ticket:");
  bookTicket.setBounds(50,270,150,30);
  JRadioButton b1 = new JRadioButton("Yes");
  JRadioButton b2 = new JRadioButton("No");
  b1.setBounds(200,270,100,30);
  b2.setBounds(300,270,100,30);

  pay = new JLabel("Pay: ");
  pay.setBounds(50,300,150,30);
  t6 = new JTextField("");
  t6.setBounds(200,300,150,30);
  
  Button b = new Button("Confirm");
  b.setBounds(200,350,120,50);

  JFrame fr = new JFrame("Ticket Confirmation Form");
  fr.add(head);
  fr.add(name); fr.add(t1);
  fr.add(source); fr.add(t2);
  fr.add(destination); fr.add(t3);
  fr.add(date); fr.add(t4);
  fr.add(clas); fr.add(c);
  fr.add(availability); fr.add(t5);
  fr.add(bookTicket); fr.add(b1); fr.add(b2);
  fr.add(pay); fr.add(t6);
  fr.add(b);

  fr.setSize(450,600);
  fr.setLayout(null);
  fr.setVisible(true);
 }
 public static void main(String args[])
 {
  Railway obj = new Railway();
 }
}
