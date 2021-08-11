import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*;
class text extends Frame implements ActionListener
 {  
    static TextField t;
    static Frame f; 
    static Button b; 
    static Label l; 

    public static void main(String[] args) 
    { 
        f = new Frame("textfield"); 
        l = new Label("nothing entered");  
        b = new Button("submit"); 
        text te = new text(); 
        b.addActionListener(te); 
        t = new TextField(16);  
        Panel p = new Panel(); 
        p.add(t); 
        p.add(b); 
        p.add(l); 
        f.add(p); 
        f.setSize(300, 300); 
        f.show(); 
    } 
  
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        if (s.equals("submit")) { 
            l.setText(t.getText()); 
            t.setText("  "); 
        } 
    } 
} 