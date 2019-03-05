package extra;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the method in
 * this recipe. 2. ask students how they might use the method to make the
 * picture in the laminated hand-outs.
 */

public class StarShow {

	Robot yee = new Robot("yee");

	void makeStars() {

		// 5. delete this line. you will draw the star again in step 8.
		// 13. Set the speed to 8
		yee.setSpeed(1000000);
		// 6. Make a variable to hold the X position of the Robot and set it to 10
		int X = 400;
		// 7. Make a variable to hold the Y position of the Robot and set it to 600
		int Y = 300;
		// 8. Make a variable to hold the star size and set it to 25
		int Size = 25;
		// 12. Repeat the steps #19 to #18, 30 times
		for (int i = 0; i < 30; i++) {

			// 19. Set the pen width to i
			yee.setPenWidth(i);
			// 10. Set the X position of the robot to your X variable
			yee.moveTo(X, Y);
			// 11. Set the Y position of the robot to your Y variable

			// 9. Call the drawStar() method with your star size variable
			drawStar(Size);
			// 14. Increase the X position by star size. See Figure 2.
			yee.setX(Size);
			// 15. decrease the Y position by star size. See Figure 3.
			yee.setY(Size);
			// 16. Increase the star size by 20
			Size+=20;
			// 17. Turn the robot 12 degrees
			yee.turn(12);
			// 18. Make each star a different random color like in Figure 4.
			yee.setRandomPenColor();
		}
	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down
		yee.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
		for (int i = 0; i < 5; i++) {

			// 1. Move the robot the distance of the starSize variable
			yee.move(starSize);
			// 3. Turn the robot 144 degrees
			yee.turn(144);
		}
	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}
