import java.applet.*;

import java.awt.*; 

import java.awt.event.*;

//<applet code="MyEvent.java" width="300" height="300"> </applet>/

public class MyEvent extends Applet implements ActionListener
{
 
Button b;  

 TextField t;  
 
public void init()
 {
  
t=new TextField();
  
t.setBounds(30,40,150,20);
  
b=new Button("Click Me");
  
b.setBounds(80,150,60,50);
  
add(b);
  
add(t);
  
b.addActionListener(this);
  
setLayout(null);
 
}  
 
public void actionPerformed(ActionEvent e)
 {
  
t.setText("Hello, Button was clicked"); 
 
}
}   