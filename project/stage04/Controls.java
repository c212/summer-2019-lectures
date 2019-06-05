import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class Controls extends JPanel implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    String what = (String)a.getSelectedItem();
    String value = v.getText(); 
    System.out.println( what + " " + value ); 
    if (what.equals("Insert")) {
      s.insert(value); 
    } else if (what.equals("Delete")) { 
      s.delete(value);       
    } else {
      s.whatevs(value, what);
    }
  }
  JComboBox a; 
  JButton b;
  JTextField v; 
  Screen s; 
  public Controls(Screen s) {
    this.s = s; 
    this.add(new JLabel("Value:")); 
    v = new JTextField(); 
    v.setPreferredSize(new Dimension(60, 20)); 
    this.add(v); 
    String[] actions = { "Operation", "Insert", "Delete" }; 
    a = new JComboBox<>(actions);
    this.add(a); 
    b = new JButton("Proceed"); 
    this.add(b); 
    b.addActionListener(this); 
  }
}