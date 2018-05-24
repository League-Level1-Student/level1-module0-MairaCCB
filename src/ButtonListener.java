import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonListener implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Click me!");

	public static void main(String[] args) {
		ButtonListener b = new ButtonListener();
		b.CreateButtons();

	}

	private void CreateButtons() {
		frame.add(button);
		frame.setVisible(true);
		frame.pack();

		button.addActionListener(this);

		button.setOpaque(true);
		button.setBackground(Color.BLUE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		button.setBackground(Color.RED);
	}
}
