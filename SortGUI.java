import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import java.awt.TextField;
import java.awt.Label;

import java.awt.*;

public class SortGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        final int SIZE = 10;
        String []list = new String[SIZE];
        Font font = new Font("Times New Roman", Font.BOLD,30);
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(10));
        Label label = new Label("Enter " + SIZE + " numbers separated by a space.");
        Label sortedList = new Label("Sorted List: ");
        label.setFont(font);
        sortedList.setFont(font);
        TextField[] textField = new TextField[SIZE]; //Try Text instead of TextField
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(5);

        borderPane.setTop(label);
        borderPane.setCenter(gridPane);
        borderPane.setBottom(sortedList);
        Scene scene = new Scene(borderPane);

        for (int i = 0; i<textField.length; i++) {
            textField[i] = new TextField();
            gridPane.add(textField[i], i, 0);
            textField[i].setOnAction(e-> {
                for(int j=0; j<list.length; j++) {
                    String [] tempList;
                    list[i] = textField[i].getText();
                    tempList = SortAR.sort(list);
                    //sortedList.setText();
                }
                System.out.println("test" + list[0]);
            });
        }

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
