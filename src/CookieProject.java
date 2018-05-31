
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CookieProject implements ActionListener {
public static void main(String[] args) {
	CookieProject c = new CookieProject();
	c.createButton();
	
}
void createButton() {
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton b = new JButton();
	f.add(b);
	f.setVisible(true);
	f.setTitle("Cookie");
	b.setText("Eat me!");
	f.pack();
	b.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("yum!");
}
}
