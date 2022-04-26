package hw08;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * This class extends pane and creates a TXT2 album
 * In order to create an instance of this class, use
 * 		TXT2 ___ = new TXT2();
 * 
 * @author Jacqueline Molina, 400920686, Cs20212 Sections 1 & 2
 *
 */
public class TXT2 extends Pane {
	
	/** Default constructor in order to create an instance of TXT2 */
	public TXT2() {
		draw();
	}
	
	/** Method draws the Base of the image */
	public void drawBase() {
		Rectangle base = new Rectangle(0, 0, 200, 200);
		base.setFill(Color.web("#88c7fa"));
		
		
		getChildren().addAll(base);
	}
	
	/**
	 *  Method utilizes Rectangles to draw the cross looking object on the album
	 */
	public void drawCross() {
		drawBase();
		
		Rectangle lwhite = new Rectangle(50, 90, 100, 20);
		lwhite.setFill(Color.WHITE);
		Rectangle bwhite = new Rectangle(90, 50, 20, 100);
		bwhite.setFill(Color.WHITE);

		
		Rectangle uyellow = new Rectangle(90, 50, 20, 60);
		uyellow.setFill(Color.web("#f9dc4b"));
		Rectangle ryellow = new Rectangle(90, 90, 60, 20);
		ryellow.setFill(Color.web("#f9dc4b"));

		
		getChildren().addAll(lwhite, bwhite, uyellow, ryellow);

	}
	
	/**
	 * Uses the Text Node to draw on the name of the album and the artist
	 */
	public void drawWords() {
		drawCross();
		
		Text title = new Text(15, 20, "THE DREAM CHAPTER:");
		title.setFont(Font.font("Calibri", 8));
		title.setFill(Color.WHITE);
		
		Text title2 = new Text(15, 30, "STAR");
		title2.setFont(Font.font("Arial", FontWeight.BOLD, 8));
		title2.setFill(Color.WHITE);
		
		Text artist = new Text(15, 190, "TOMORROW X TOGETHER");
		artist.setFont(Font.font("Arial", FontWeight.BOLD, 7));
		artist.setFill(Color.WHITE);
		
		Text name = new Text(140, 210, "JACQUELINE MOLINA");
		name.setFont(Font.font("Arial", FontWeight.BOLD, 6));
		name.setFill(Color.DARKGREEN);

		
		getChildren().addAll(title, artist, title2, name);
	}
	
	/** calls upon the previous method to make calling this method in the constructor easier */
	public void draw() {
		drawWords();
	}

}
