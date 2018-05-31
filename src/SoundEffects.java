import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects {
public static void main(String[] args) {
	SoundEffects s = new SoundEffects();
	s.CreateSounds();
}

void CreateSounds() {
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JPanel p = new JPanel();
	f.setVisible(true);
	f.setTitle("Sounds");
	f.add(p);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	b1.setText("Sound1");
	b2.setText("Sound2");
	b3.setText("Sound3");

	f.pack();
}
}
