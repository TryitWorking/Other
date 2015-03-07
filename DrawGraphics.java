package HW1_package;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
	BouncingBox box, box2, box3;
	
	ArrayList<BouncingBox> movingBoxes; //ArrayList to hold all instances of Bouncing Boxes
	
	/** Initializes this class for drawing. */
	public DrawGraphics() {
			
			movingBoxes = new ArrayList<BouncingBox>();
			//the 3 boxes
			box = new BouncingBox(200, 50, Color.RED);
			box2 = new BouncingBox(100, 100, Color.BLACK);
			box3 = new BouncingBox(150, 150, Color.CYAN);
			
			//setting movement vector coordinates
			box.setMovementVector(1, 0);
			box2.setMovementVector(0, 1);
			box3.setMovementVector(1, 1);
			
			//adding the boxes to the ArrayList movingBoxes
			movingBoxes.add(box);
			movingBoxes.add(box2);
			movingBoxes.add(box3);
	}
	
	/** Draw the contents of the window on surface. Called 20 times per second. */
	public void draw(Graphics surface){
		//iterate through the ArrayList and call the draw method for each instance of BouncingBox
		for(int i=0; i<movingBoxes.size();i++){
			movingBoxes.get(i).draw(surface);;
		}
		
	}
}