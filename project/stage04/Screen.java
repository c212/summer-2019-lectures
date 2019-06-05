import javax.swing.*; 
import java.awt.*; 

public class Screen extends JComponent {
  String what = "..."; 
  int value = 123; 
  String message = " Howdy. "; 
  public void insert(String value) {
    try {
      this.what = "Insert"; 
      this.value = Integer.parseInt(value);       
      this.message = what + " " + value; 
    } catch (Exception e) {
      this.message = "Not a number: (" + this.what + ", " + value + ")"; 
    }
    repaint();
  }
  public void delete(String value) {
    try {
      this.value = Integer.parseInt(value);       
      this.what = "Delete"; 
      this.message = what + " " + value; 
    } catch (Exception e) {
      this.message = "Not a number: (" + this.what + ", " + value + ")"; 
    }
    repaint(); 
  }
  public void whatevs(String value, String what) {
    this.message = "Not implemented: (" + what + "/" + value + ")"; 
    repaint(); 
  }
  public void paintComponent(Graphics g) {
    // System.out.println("ksajdghdsgakjh " + what + " " + value); 
    g.drawString(this.message, 100, 100);   
    // g.setColor(Color.RED); 
    // g.drawOval(30, 30, 100, 100); 
  }
}