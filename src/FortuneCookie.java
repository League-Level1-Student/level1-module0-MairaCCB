import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	Random r = new Random();
	int c = 0;
	public static void main(String[] args) {
		FortuneCookie c = new FortuneCookie();
		c.showButton();

	}

	void showButton() {
		System.out.println("Button Clicked");
		JFrame f = new JFrame();
		f.setTitle("Fortune Cookie");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		JButton b = new JButton();
		f.add(b);
		b.addActionListener(this);
		b.setText("Click here for a fortune. ");
		f.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int ran = r.nextInt(3);
		if (ran == 0) {
			JOptionPane.showMessageDialog(null, "You will be getting a pet very soon...");
		} else if (ran == 1) {
			JOptionPane.showMessageDialog(null, "You will recieve tasty cookie very soon...");
		} else if (ran == 2) {
			JOptionPane.showMessageDialog(null, "You might get your level 0 certificate today...");
		}
		c++;
		if(c == 5) {
			System.exit(0);
		}
	}
}