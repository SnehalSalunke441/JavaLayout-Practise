import static java.awt.event.InputEvent.CTRL_DOWN_MASK;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBar extends JFrame {
  private JMenuBar menuBar = new JMenuBar(); 
  private JMenuItem newItem, openItem, closeItem, saveItem, saveAsItem, printItem,undo,cut,copy1,paste;
 
  public MenuBar(String title) {
    JMenu fileMenu = new JMenu("File"); // Create File menu
    JMenu editMenu = new JMenu("Edit"); // Create Elements menu
    fileMenu.setMnemonic('F'); // Create shortcut
    editMenu.setMnemonic('E'); // Create shortcut
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setJMenuBar(menuBar);

    newItem = fileMenu.add("New");
    openItem = fileMenu.add("Open");
    closeItem = fileMenu.add("Close");
    fileMenu.addSeparator();
    saveItem = fileMenu.add("Save");
    saveAsItem = fileMenu.add("Save As...");
    fileMenu.addSeparator();
    printItem = fileMenu.add("Print");

    undo=editMenu.add("Undo");
    editMenu.addSeparator();
    cut=editMenu.add("Cut");
    copy1=editMenu.add("Copy");
    paste=editMenu.add("Paste");

    menuBar.add(fileMenu);
    menuBar.add(editMenu);

    newItem.setAccelerator(KeyStroke.getKeyStroke('N', CTRL_DOWN_MASK));
    openItem.setAccelerator(KeyStroke.getKeyStroke('O', CTRL_DOWN_MASK));
    saveItem.setAccelerator(KeyStroke.getKeyStroke('S', CTRL_DOWN_MASK));
    printItem.setAccelerator(KeyStroke.getKeyStroke('P', CTRL_DOWN_MASK));

    undo.setAccelerator(KeyStroke.getKeyStroke('Z', CTRL_DOWN_MASK));
    cut.setAccelerator(KeyStroke.getKeyStroke('X', CTRL_DOWN_MASK));
    copy1.setAccelerator(KeyStroke.getKeyStroke('C', CTRL_DOWN_MASK));
    paste.setAccelerator(KeyStroke.getKeyStroke('V', CTRL_DOWN_MASK));
    
    menuBar.add(fileMenu);
    menuBar.add(editMenu);
  }
  public static void main(String[] args) 
  {
    MenuBar window = new MenuBar("");
    window.setBounds(30, 30, 300, 300);
    window.setVisible(true);
  }
}