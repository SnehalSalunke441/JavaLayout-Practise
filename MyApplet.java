import java.awt.*;
import java.applet.*;

public class MyApplet extends Applet
{
 String str;   
 public void init()
 {
  str = "Hello" + "Snehal" ;
 }
 public void paint(Graphics g){
     g.drawString(str, 10,100);
 }
}

