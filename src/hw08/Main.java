package hw08;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Main class for all Album Panes to be implemented into
 * The layout of this GUI: GridPane
 * 
 * A total of 6 album panes are used (TXT, NCTU, MonstaX, AKMU, TWICE, TXT2)
 * 
 * @author Jacqueline Molina, 400920686, Cs20212 Sections 1 & 2
 *
 */
public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		/** Creates an instance of each album pane class */
		TXT txt = new TXT();
		NCTU nct = new NCTU();
		MonstaX mx = new MonstaX();
		AKMU akmu = new AKMU();
		TWICE twice = new TWICE();
		TXT2 txt2 = new TXT2();
		
		/** Uses the GridPane layout */
		GridPane pane = new GridPane();
		
		pane.add(mx, 0, 0);
		pane.add(twice, 1, 0);
		pane.add(nct, 2, 0);

		pane.add(akmu, 0, 1);
		pane.add(txt2, 2, 1);
		pane.add(txt, 1, 1);
		
		/** Personalizes the pane the albums rest on top of */
		pane.setPadding(new Insets( 10, 10, 10, 10));
		pane.setStyle("-fx-background-color: BEIGE");
		pane.setHgap(3);
		pane.setVgap(3);
		
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ALBUMS");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
