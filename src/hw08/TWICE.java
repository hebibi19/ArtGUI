package hw08;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * This class extends pane and creates a TWICE album
 * In order to create an instance of this class, use
 * 		TWICE ___ = new TWICE();
 * 
 * @author Jacqueline Molina
 *
 */
public class TWICE extends Pane {
	
	/** Default constructor in order to create an instance of TWICE */
	public TWICE() {
		draw();
	}
	
	/** Method draws the Base of the image */
	public void drawBase() {
		Rectangle base = new Rectangle(0, 0, 200, 200);
		base.setFill(Color.web("#173053"));
		
		Polygon base2 = new Polygon(2, 198, 198, 198, 198, 2);
		base2.setFill(Color.web("#0e1d39"));
		
		
		getChildren().addAll(base, base2);

	}
	
	/**
	 * Method uses rectangles to draw 9 squares onto the album
	 */
	public void drawSquares() {
		drawBase();
		
		Rectangle s1 = new Rectangle(30, 40, 40, 40);
		Rectangle s2 = new Rectangle(80, 40, 40, 40);
		Rectangle s3 = new Rectangle(130, 40, 40, 40);
		
		Rectangle s4 = new Rectangle(30, 90, 40, 40);
		Rectangle s5 = new Rectangle(80, 90, 40, 40);
		Rectangle s6 = new Rectangle(130, 90, 40, 40);
		
		Rectangle s7 = new Rectangle(30, 140, 40, 40);
		Rectangle s8 = new Rectangle(80, 140, 40, 40);
		Rectangle s9 = new Rectangle(130, 140, 40, 40);
		
		s1.setStroke(Color.web("#d64265"));
		s2.setStroke(Color.web("#d64265"));
		s3.setStroke(Color.web("#d64265"));
		s4.setStroke(Color.web("#d64265"));
		s5.setStroke(Color.web("#d64265"));
		s6.setStroke(Color.web("#d64265"));
		s7.setStroke(Color.web("#d64265"));
		s8.setStroke(Color.web("#d64265"));
		s9.setStroke(Color.web("#d64265"));	
		
		s1.setFill(Color.web("#80CBC4"));
		s2.setFill(Color.web("#FF1744"));
		s3.setFill(Color.web("#0277BD"));
		s4.setFill(Color.web("#81D4FA"));
		s5.setFill(Color.web("#FFB74D"));
		s6.setFill(Color.web("#FFFFFF"));
		s7.setFill(Color.web("#9FA8DA"));
		s8.setFill(Color.web("#AED581"));
		s9.setFill(Color.web("#FFCDD2"));
		
		
		getChildren().addAll(s1, s2, s3, s4, s5, s6, s7, s8, s9);
	}
	
	/**
	 * Method uses polyline shapes to create the title of the album
	 * Method also uses text to write the artist name
	 */
	public void drawWords() {
		drawSquares();
		
		// Writing the album name
		Polyline s = new Polyline(80, 15, 70, 23, 80, 31, 70, 39);
		s.setStrokeWidth(1.8);
		s.setStroke(Color.web("#d64265"));
		Polyline i = new Polyline(83, 18, 83, 31);
		i.setStrokeWidth(1.8);
		i.setStroke(Color.web("#d64265"));
		Polyline g = new Polyline(94, 18, 86, 18, 86, 31, 94, 31, 94, 24.5, 91, 24.5);
		g.setStrokeWidth(1.8);
		g.setStroke(Color.web("#d64265"));
		Polyline n = new Polyline(97, 31, 97, 18, 107, 18, 107, 31);
		n.setStrokeWidth(1.8);
		n.setStroke(Color.web("#d64265"));
		Polyline a = new Polyline(110, 31, 110, 18, 120, 18, 120, 31);
		a.setStrokeWidth(1.8);
		a.setStroke(Color.web("#d64265"));
		Polyline a_line = new Polyline(110, 24.5, 120, 24.5);
		a_line.setStrokeWidth(1.8);
		a_line.setStroke(Color.web("#d64265"));
		Polyline l = new Polyline(123, 18, 123, 31, 133, 31);
		l.setStrokeWidth(1.8);
		l.setStroke(Color.web("#d64265"));
		
		// writing the artist name 
		Text title = new Text(70, 10, "TWICE | THE 4TH MINI ALBUM");
		title.setFont(Font.font("Arial", FontWeight.BOLD , 4));
		title.setFill(Color.web("#50637e"));
		
		Text artist = new Text(84.5, 193, "~TWICE~");
		artist.setFont(Font.font("Verdana", FontWeight.BOLD, 6));
		artist.setFill(Color.web("#d64265"));

		
		getChildren().addAll(s, i, g, n, a, a_line, l, title, artist);
	}
	
	/** calls upon the previous method to make calling this method in the constructor easier */
	public void draw() {
		drawWords();
	}
}
