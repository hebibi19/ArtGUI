package hw08;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

/**
 * This class extends pane and creates a NCTU album
 * In order to create an instance of this class, use
 * 		NCTU ___ = new NCTU();
 * 
 * @author Jacqueline Molina
 *
 */
public class NCTU extends Pane {
	
	/** Default constructor in order to create an instance of NCTU */
	public NCTU() {
		draw();
	}
	
	
	/** Method draws the Base of the image */
	public void drawBase() { 
		Rectangle base = new Rectangle(0, 0, 200, 200);
		base.setFill(Color.BLACK);
		getChildren().add(base);
	}
	
	/**
	 * Method uses Line to add a dashed line across the top of the image
	 */
	public void dashAcross() {
		drawBase();
		
		Line line = new Line(25.5, 25, 174.5, 25);
		line.setStroke(Color.WHITE);
		line.getStrokeDashArray().addAll(2d, 5d);
		
		getChildren().add(line);
	}
	
	/**
	 * Method uses the Arc shape in order to create a C
	 */
	public void drawC() {
		dashAcross();
		
		Arc arc2 = new Arc(100, 100, 75, 75, 90, 235);
		arc2.setStroke(Color.WHITE);
		
		getChildren().add(arc2);
	}
	
	/**
	 * Method uses the Line shape to create an N
	 */
	public void drawN() {
		drawC();
		
		Line line1 = new Line(25.5, 90, 25.5, 175);
		line1.setStroke(Color.WHITE);
		
		Line line2 = new Line(25.5, 25, 174.5, 180);
		line2.setStroke(Color.WHITE);
		
		Line line3 = new Line(174.5, 89, 174.5, 180);
		line3.setStroke(Color.WHITE);
		
		getChildren().addAll(line1, line2, line3);
	}
	
	/**
	 * Method uses both Line and Arc to create a U
	 */
	public void drawU() {
		drawN();
		
		Arc arc1 = new Arc(100, 100, 75, 80, 173, 195);
		arc1.setStroke(Color.RED);
		arc1.setType(ArcType.OPEN);
		
		Line L_Line = new Line(25.5, 25, 25.5, 90);
		L_Line.setStroke(Color.RED);
		
		Line R_Line = new Line(174.5, 25, 174.5, 89);
		R_Line.setStroke(Color.RED);
		
		
		getChildren().addAll(arc1, L_Line, R_Line);
	}
	
	/**
	 * Method uses Line to fill in the rest of the N which was blocked by the U arc
	 */
	public void fillN() {
		drawU();
		
		Line line1 = new Line(25.5, 25, 152, 156);
		line1.setStroke(Color.WHITE);
		
		getChildren().add(line1);
	}
	
	/**
	 * Method uses Line to draw a dashed line going down the center of the image
	 */
	public void dashDown() {
		fillN();
		
		Line line = new Line(100, 25.5, 100, 173);
		line.setStroke(Color.WHITE);
		line.getStrokeDashArray().addAll(2d, 5d);
		
		getChildren().add(line);
	}
	
	/**
	 * Method uses the Polygon shapes to draw small triangles onto the ends of Lines
	 */
	public void drawTriangles() {
		dashDown();
		
		Polygon top1 = new Polygon(95, 23, 95, 27, 100, 25);
		top1.setStroke(Color.WHITE);
		top1.setFill(Color.WHITE);
		
		Polygon top2 = new Polygon(173.5, 30, 176.5, 30, 174.5, 25);
		top2.setStroke(Color.RED);
		top2.setFill(Color.RED);
		
		Polygon bottom1 = new Polygon(98, 174, 102, 174, 100, 179);
		bottom1.setStroke(Color.WHITE);
		bottom1.setFill(Color.WHITE);
		
		Polygon bottom2 = new Polygon(23.5, 174, 27.5, 174, 25.5, 179);
		bottom2.setStroke(Color.WHITE);
		bottom2.setFill(Color.WHITE);

		
		getChildren().addAll(top1, top2, bottom1, bottom2);
	}
	
	/** calls upon the previous method to make calling this method in the constructor easier */
	public void draw() {
		drawTriangles();
		
	}
}
