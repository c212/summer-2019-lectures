import javax.swing.*;
import java.awt.*;

public class Four {
  public static void main(String[] args) {
    JFrame a = new JFrame();
    Container c = a.getContentPane(); 
    c.setLayout(new BorderLayout()); 
    Screen s = new Screen(); 
    c.add(s, BorderLayout.CENTER); 
    c.add(new Controls(s), BorderLayout.NORTH); 
    a.setSize(400, 400); 
    a.setVisible(true); 
  }
}