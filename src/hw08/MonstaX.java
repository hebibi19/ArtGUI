package hw08;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * This class extends pane and creates a MonstaX album
 * In order to create an instance of this class, use
 * 		MonstaX ___ = new MonstaX();
 * 
 * @author Jacqueline Molina, 400920686, CS20212 Sections 1 & 2
 *
 */
public class MonstaX extends Pane {
	
	/** Default constructor in order to create an instance of MonstaX */
	public MonstaX() {
		draw();
	}
	
	/** Method draws the Base of the image */
	public void drawBase() {
		Rectangle base = new Rectangle(0, 0, 200, 200);
		base.setFill(Color.web("#212121"));
		
		getChildren().addAll(base);

	}
	
	/**
	 * Method uses Polygon to draw center design on album
	 */
	public void drawSign() {
		drawBase();
		
		Polygon shape = new Polygon(100, 120, 40, 50, 50, 50, 50, 150, 60, 150, 100, 120, 140, 150, 150, 150, 150, 50,
				40, 50);
		shape.setFill(Color.web("#4d8766"));
		
		Polygon shape2 = new Polygon(100, 80, 60, 50, 140, 50);
		shape2.setFill(Color.web("#212121"));
		
		Polygon shape3 = new Polygon(70, 85, 70, 115, 90, 100);
		shape3.setFill(Color.web("#212121"));
		
		Polygon shape4 = new Polygon(130, 85, 130, 115, 110, 100);
		shape4.setFill(Color.web("#212121"));


		
		getChildren().addAll(shape, shape2, shape3, shape4);
	}
	
	/**
	 * Method uses Circles and Lines to create the background semi-transparent pattern
	 */
	public void drawBackground() {
		drawSign();
		
		Circle circle1 = new Circle(100, 100, 12);
		circle1.setStroke(Color.web("#2e2e2e"));
		circle1.setFill(Color.TRANSPARENT);
		circle1.setOpacity(0.3);
		
		Circle circle2 = new Circle(100, 100, 35);
		circle2.setStroke(Color.web("#2e2e2e"));
		circle2.setFill(Color.TRANSPARENT);
		circle2.setOpacity(0.3);

		
		Circle circle3 = new Circle(100, 100, 55);
		circle3.setStroke(Color.web("#2e2e2e"));
		circle3.setFill(Color.TRANSPARENT);
		circle3.setOpacity(0.3);

		
		Circle circle4 = new Circle(100, 100, 96);
		circle4.setStroke(Color.web("#2e2e2e"));
		circle4.setFill(Color.TRANSPARENT);
		circle4.setOpacity(0.3);
		
		Line line1 = new Line(100, 2, 100, 198);
		Line line2 = new Line(2, 100, 198, 100);
		Line line3 = new Line(198, 50, 2, 150);
		Line line4 = new Line(50, 198, 150, 2);
		
		Line line5 = new Line(50,2, 150, 198);
		Line line6 = new Line(2, 50, 198, 150);
		
		
		line1.setStroke(Color.web("#2e2e2e"));
		line1.setOpacity(0.3);

		line2.setStroke(Color.web("#2e2e2e"));
		line2.setOpacity(0.3);

		line3.setStroke(Color.web("#2e2e2e"));
		line3.setOpacity(0.3);

		line4.setStroke(Color.web("#2e2e2e"));
		line4.setOpacity(0.3);

		line5.setStroke(Color.web("#2e2e2e"));
		line5.setOpacity(0.3);

		line6.setStroke(Color.web("#2e2e2e"));
		line6.setOpacity(0.3);


		
		getChildren().addAll(circle2, line1, line2, line3, line4, line5, line6, circle1, circle3, circle4);
	}
	
	/**
	 * Method uses Circles and Lines to create 7 distinct looking clock figures near the bottom
	 * of the album drawing
	 */
	public void drawClocks() {
		drawBackground();
		
		Circle c1 = new Circle(50, 175, 6);
		Circle c2 = new Circle(67, 175, 6);
		Circle c3 = new Circle(83, 175, 6);
		Circle c4 = new Circle(100, 175, 6);
		
		c1.setFill(Color.TRANSPARENT);
		c2.setFill(Color.TRANSPARENT);
		c3.setFill(Color.TRANSPARENT);
		c4.setFill(Color.TRANSPARENT);
		
		c1.setStroke(Color.web("#4d8766"));
		c2.setStroke(Color.web("#4d8766"));
		c3.setStroke(Color.web("#4d8766"));
		c4.setStroke(Color.web("#4d8766"));
		
		Line l1 = new Line(45, 175, 55, 175);
		l1.setStroke(Color.web("#4d8766"));
		
		Line l2 = new Line(67, 175, 63, 179);
		l2.setStroke(Color.web("#4d8766"));
		Line l3 = new Line(67, 175, 71, 179);
		l3.setStroke(Color.web("#4d8766"));
		
		Line l4 = new Line(83, 175, 87, 171);
		l4.setStroke(Color.web("#4d8766"));
		Line l5 = new Line(83, 175, 87, 179);
		l5.setStroke(Color.web("#4d8766"));
		
		Line l6 = new Line(95, 172, 105, 178);
		l6.setStroke(Color.web("#4d8766"));
		
		
		
		Circle c5 = new Circle(117, 175, 6);
		Circle c6 = new Circle(133, 175, 6);
		Circle c7 = new Circle(150, 175, 6);
		
		c5.setFill(Color.TRANSPARENT);
		c6.setFill(Color.TRANSPARENT);
		c7.setFill(Color.TRANSPARENT);
		
		c5.setStroke(Color.web("#4d8766"));
		c6.setStroke(Color.web("#4d8766"));
		c7.setStroke(Color.web("#4d8766"));

		Line l7 = new Line(117, 175, 113, 172);
		l7.setStroke(Color.web("#4d8766"));
		Line l8 = new Line(117, 175, 121, 172);
		l8.setStroke(Color.web("#4d8766"));
		
		Line l9 = new Line(133, 175, 133, 170);
		l9.setStroke(Color.web("#4d8766"));
		Line l10 = new Line(133, 175, 129, 177);
		l10.setStroke(Color.web("#4d8766"));
		
		Line l11 = new Line(150, 170, 150, 180);
		l11.setStroke(Color.web("#4d8766"));

		
		getChildren().addAll(c1, c2, c3, c4, c5, c6, c7, l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11);
	}
	
	/**
	 * Uses the Text Node to draw on the name of the album and the artist
	 */
	public void drawText() {
		drawClocks();
		
		Text title = new Text(50, 40, "THE CONNECT");
		title.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
		title.setFill(Color.TRANSPARENT);
		title.setStroke(Color.web("#4d8766"));
		
		Text artist = new Text(49, 29, "MONSTA X");
		artist.setFont(Font.font("Verdana", FontWeight.BOLD, 13));
		artist.setFill(Color.web("#4d8766"));

		
		getChildren().addAll(title, artist);
	}
	
	/** calls upon the previous method to make calling this method in the constructor easier */
	public void draw() {
		drawText();
	}

}
