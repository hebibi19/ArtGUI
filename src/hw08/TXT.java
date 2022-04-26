package hw08;

import java.util.Random;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * This class extends pane and creates a TXT album
 * In order to create an instance of this class, use
 * 		TXT ___ = new TXT();
 * 
 * @author Jacqueline Molina
 *
 */
public class TXT extends Pane {
	
	/** Default constructor in order to create an instance of TXT */
	public TXT() {
		draw();
	}
	
	/** Method draws the Base of the image */
	public void drawBase() {
		Rectangle base = new Rectangle(0, 0, 200, 200);
		base.setFill(Color.web("#1a3059"));
		
		Rectangle base2 = new Rectangle(25, 25, 150, 150);
		base2.setFill(Color.web("#c2cbcc"));
		base2.setRotate(3);
		
		getChildren().addAll(base, base2);

	}
	
	/**
	 * Method draws in blue triangles using Polygons
	 */
	public void drawTriangles() {
		drawBase();
		
		Polygon tri1 = new Polygon(20, 50, 45, 45, 35, 130);
		tri1.setFill(Color.web("#1a3059"));
		
		Polygon tri2 = new Polygon(40, 160, 45, 190, 135, 167);
		tri2.setFill(Color.web("#1a3059"));
		
		Polygon tri3 = new Polygon(160, 160, 180, 155, 168, 65);
		tri3.setFill(Color.web("#1a3059"));
		
		Polygon tri4 = new Polygon(60, 40, 160, 45, 150, 20);
		tri4.setFill(Color.web("#1a3059"));

		
		getChildren().addAll(tri1, tri2, tri3, tri4);
	}
	
	/**
	 * Method uses Rectangles to create a pink cross in the center of the image
	 */
	public void drawX() {
		drawTriangles();
		
		Rectangle left = new Rectangle(80, 10, 40, 180);
		left.setRotate(-45);
		left.setFill(Color.web("#ee87a6"));
		
		Rectangle right = new Rectangle(80, 10, 40, 180);
		right.setRotate(45);
		right.setFill(Color.web("#ee87a6"));

		
		getChildren().addAll(left, right);
	}
	
	
	/**
	 * Method uses Polygon and Text to add the smaller details onto the album
	 */
	public void drawDetails() {
		drawX();
		
		// adds the blue triangles to the pink cross
		Polygon sh1 = new Polygon(145, 170, 155, 155, 55, 70);
		sh1.setFill(Color.web("#1a3059"));

		Polygon sh2 = new Polygon(30, 145, 40, 160, 130, 60);
		sh2.setFill(Color.web("#1a3059"));

		Polygon sh3 = new Polygon(55, 30, 45, 45, 145, 130);
		sh3.setFill(Color.web("#1a3059"));

		Polygon sh4 = new Polygon(160, 40, 170, 55, 75, 140);
		sh4.setFill(Color.web("#1a3059"));

		// adds the album name and the artist
		Text title = new Text(40, 15, "THE CHAOS CHAPTER: FIGHT OR ESCAPE");
		title.setFont(Font.font("Arial", FontWeight.BOLD, 6));
		title.setFill(Color.web("#c2cbcc"));
		
		Text artist = new Text(60, 190, "TOMORROW X TOGETHER");
		artist.setFont(Font.font("Arial", FontWeight.BOLD, 6));
		artist.setFill(Color.web("#c2cbcc"));


		getChildren().addAll(sh1, sh2, sh3, sh4, title, artist);
	}
	
	/**
	 * Method utilizes Circles and Polygons to create a heart in the center of the image
	 * 		The Random class is used in order to make the heart appear a different color 
	 * 		each time the GUI is ran
	 */
	public void drawHeart() {
		drawDetails();
		
		Circle bcircle1 = new Circle(90,92,11);
		bcircle1.setFill(Color.web("#1a3059"));
		Circle bcircle2 = new Circle(110,92,11);
		bcircle2.setFill(Color.web("#1a3059"));
		
		Circle circle1 = new Circle(93,95,8);
		Circle circle2 = new Circle(107,95,8);
		Polygon point = new Polygon(84.5,96, 115.5, 96, 100, 115);
		
		Random r = new Random();
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);
		
		Color newColor = Color.rgb(red,  green, blue);
		circle1.setFill(newColor);
		circle2.setFill(newColor);
		point.setFill(newColor);


		getChildren().addAll(bcircle1, bcircle2, circle1, circle2, point);
	}
	
	/** calls upon the previous method to make calling this method in the constructor easier */
	public void draw() {
		drawHeart();
	}
	
}
