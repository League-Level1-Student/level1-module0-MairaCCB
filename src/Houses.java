import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Color grass = new Color(0, 102, 0);
	static Robot m = new Robot();

	static Random ran = new Random();

	public static void main(String[] args) {

		m.hide();
		m.setSpeed(200);
		m.moveTo(0, 500);
		m.penDown();
		m.setPenWidth(5);

		for (int x = 1; x < 11; x++) {
			grass();
			int r = ran.nextInt(2);

			if (r == 0) {
				flatHouse();
			}

			else {
				pointyHouse();
			}
		}
		grass();

	}

	static void flatHouse() {
		int f = ran.nextInt(200) + 100;
		m.setRandomPenColor();
		m.turn(-90);
		m.move(f);
		m.turn(90);
		m.move(50);
		m.turn(90);
		m.move(f);
	}

	static void pointyHouse() {
		int p = ran.nextInt(200) + 100;
		m.setRandomPenColor();
		m.turn(-90);
		m.move(p);
		m.turn(45);
		m.move(50);
		m.turn(90);
		m.move(50);
		m.turn(45);
		m.move(p);
	}

	static void grass() {
		m.setPenColor(grass);
		m.setAngle(90);
		m.move(25);
	}
}
