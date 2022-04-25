package controller;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.layout.StackPane;
import javafx.scene.Parent;
import javafx.event.ActionEvent;



public class sideController implements Initializable {
	//@FXML
	//private Label exit;
	@FXML
	private StackPane contentArea;
	
	
	@Override
	public void initialize(URL location, ResourceBundle reourcebundle) {
		
		System.out.println("Hoal");
		/*exit.setOnMouseClicked(e -> {
			System.exit(0);
		});*/
		try {
			Parent fxml = FXMLLoader.load(getClass().getResource("/view/home.fxml"));
			System.out.print(fxml);
			contentArea.getChildren().removeAll();
			contentArea.getChildren().setAll(fxml);
		} catch (Exception e) {
			e.getMessage();
			System.out.println("error al cargar ventana");
		}
		
	}
	public void home(ActionEvent actionEvent) throws Exception{
        Parent fxml = FXMLLoader.load(getClass().getResource("/view/home.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
        
	}
	public void page1(ActionEvent actionEvent) throws Exception{
        Parent fxml = FXMLLoader.load(getClass().getResource("/view/page1.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
        
	}
	public void page2(ActionEvent actionEvent) throws Exception{
        Parent fxml = FXMLLoader.load(getClass().getResource("/view/page2.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
        
	}
	public void page3(ActionEvent actionEvent) throws Exception{
        Parent fxml = FXMLLoader.load(getClass().getResource("/view/page3.fxml"));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
        
	}
	


}
