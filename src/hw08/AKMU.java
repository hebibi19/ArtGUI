package hw08;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * This class extends pane and creates a AKMU album
 * In order to create an instance of this class, use
 * 		AKMU ___ = new AMKU();
 * 
 * @author Jacqueline Molina, 400920686, CS20212 Sections 1 & 2
 *
 */
public class AKMU extends Pane {
	
	/** Default constructor in order to create an instance of AKMU */
	public AKMU() {
		draw();
	}
	
	/** Method draws the Base of the image */
	public void drawBase() {
		Rectangle base = new Rectangle(0, 0, 200, 200);
		base.setFill(Color.web("#357835"));
		
		
		getChildren().addAll(base);
	}
	
	/**
	 * Method utilizes the Circle shape and the Polygon Shape to draw the center piece of the album
	 */
	public void drawCircle() {
		drawBase();
		
		Circle circle = new Circle(100, 85, 60);
		Stop[] stops = new Stop[] {
				new Stop(0, Color.web("#104ddd")),
				new Stop(1, Color.web("#5473d7"))
		};
		
		// creates a gradient for the circle color
		LinearGradient gradient = new LinearGradient(0, 0, 0, 1, true, CycleMethod.NO_CYCLE, stops);		
		circle.setFill(gradient);
		
		// polygon shape is used to create a cloud like shape and to create shadows in the clouds
		Polygon shape = new Polygon(100, 100, 105, 100, 110, 95, 130, 95, 140, 80, 150, 90, 160, 95,
				157, 110, 155, 115, 151, 120, 146, 125, 125, 140, 100, 145, 85, 145, 65, 135, 45, 110, 
				75, 90);
		
		Polygon shadow = new Polygon(100, 100, 120, 120, 135, 117, 140, 122, 142, 110, 85, 110);
		Polygon shadow2 = new Polygon(80, 120, 70, 110, 60, 130, 100, 100, 110, 90);
		
		shape.setFill(Color.web("#e8f0fb"));
		shadow.setFill(Color.web("#7d9cf3"));
		shadow2.setFill(Color.web("#7d9cf3"));
		
		
		getChildren().addAll(circle, shape, shadow, shadow2);
		
	}
	
	/**
	 * Uses the Text Node to draw on the name of the album and the artist
	 */
	public void drawWords() {
		drawCircle();
		
		Text title = new Text(15, 175, "NEXT EPISODE");
		title.setFont(Font.font("Times New Roman",25));
		title.setFill(Color.web("#f8e067"));
		
		Text artist = new Text(81, 20, "AKMU");
		artist.setFont(Font.font("Arial", FontWeight.BOLD, 13));
		artist.setFill(Color.web("#f8e067"));

		
		getChildren().addAll(title, artist);
	}
	
	/** calls upon the previous method to make calling this method in the constructor easier */
	public void draw() {
		drawWords();
	}
}
