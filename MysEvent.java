import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*;
class MysEvent extends Frame implements ActionListener
 {  
    static TextField t;
    static Frame f; 
    static Button b; 
  

    public static void main(String[] args) 
    { 
        f = new Frame("textfield"); 
        b = new Button("submit"); 
        MysEvent te = new MysEvent(); 
        b.addActionListener(te); 
        t = new TextField(16);  
        Panel p = new Panel(); 
        p.add(t); 
        p.add(b);  
        f.add(p); 
        f.setSize(300, 300); 
        f.setVisible(true); 
    } 
  
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        if (s.equals("submit")) { 
            t.setText("I clicked it "); 
        } 
    } 
} 