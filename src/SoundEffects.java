import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	
public static void main(String[] args) {
	SoundEffects s = new SoundEffects();
	s.CreateSounds();
	
}

void CreateSounds() {
	JFrame f = new JFrame();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel p = new JPanel();
	f.setVisible(true);
	f.setTitle("Sounds");
	f.add(p);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	b1.setText("Cat Meow");
	b2.setText("Dog Bark");
	b3.setText("Bird Chirp");

	f.pack();
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
}

private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == b1) {
		playSound("catMeow.wav");
	}
	
	else if(e.getSource() == b2) {
		playSound("Bark.wav");
	}
	
	else if(e.getSource() == b3) {
		playSound("BirdChirp.wav");
	}
}
}
