
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.util.Random;

	public class p1 {

	  public static void main(String[] args) throws Exception {
	    Robot robot = new Robot();
	    Random random = new Random();
	   // this code will keep on moving mouse pointer to a random location
	    while (true) {
	      robot.delay(1000 * 60);
	      int x = random.nextInt() % 640;
	      int y = random.nextInt() % 480;
	      robot.mouseMove(x, y);

	    }
	  }
	}

