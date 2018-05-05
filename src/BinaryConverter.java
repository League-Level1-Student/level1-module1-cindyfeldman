import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener  {
JButton button;
JFrame frame;
JLabel label;
JTextField text ;
JPanel panel ;
public static void main(String[] args) {
	
BinaryConverter one  = new BinaryConverter();
one.binary();

}
  void binary() {
	 	 frame = new JFrame();
		 panel = new JPanel();
		 button = new JButton("convert");
		 label = new JLabel();
		 text = new JTextField(20);
		panel.add(text);
	panel.add(label);
		frame.add(panel);
		panel.add(button);
		
		frame.pack();
		frame.setVisible(true);
		button.addActionListener(this);
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()== button) {
	String input = text.getText();
	System.out.println(convert(input));
 
	}
}}
