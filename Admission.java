import java.awt.*;
import javax.swing.*;
public class Admission
{
 public Admission()
 {
  JLabel head, name, rollno, mailid, address;
  JTextField t1,t2,t3,t4,t5,t6;
  
  head = new JLabel("UMIT, SNDT Women's University");
  head.setBounds(150, 10, 250, 30);
 
  name = new JLabel("Name of Student: ");
  name.setBounds(50,50,150,30);
  t1 = new JTextField("");
  t1.setBounds(200,50,150,30);
  
  rollno = new JLabel("Roll No.: ");
  rollno.setBounds(50,90,150,30);
  t2 = new JTextField("");
  t2.setBounds(200,90,150,30);
  
  mailid = new JLabel("Mail ID: ");
  mailid.setBounds(50,130,150,30);
  t3 = new JTextField("");
  t3.setBounds(200,130,150,30);
  
  address = new JLabel("Address: ");
  address.setBounds(50,170,150,30);
  t4 = new JTextField("");
  t4.setBounds(200,170,150,30);

  Button b1 = new Button("CLEAR");
  b1.setBounds(50,230,120,50);
  Button b2 = new Button("SUBMIT");
  b2.setBounds(200,230,120,50);

  JFrame fr = new JFrame("Student Details - Admission Form");
  fr.add(head);
  fr.add(name); fr.add(t1);
  fr.add(rollno); fr.add(t2);
  fr.add(mailid); fr.add(t3);
  fr.add(address); fr.add(t4);
  fr.add(b1); fr.add(b2);


  fr.setSize(450,450);
  fr.setLayout(null);
  fr.setVisible(true);
 }
 public static void main(String args[])
 {
  Admission obj = new Admission();
 }
}
