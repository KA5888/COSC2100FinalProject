package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
	protected Stage stage;
	protected TableView<Restaurant> homeTable;

	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<Restaurant> restaurants = FXCollections.observableArrayList();
	}

	public void toLogin(ActionEvent event) {
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/Login.fxml"));
			stage.setScene(new Scene(root, 550, 400));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void toLocation(ActionEvent event) {
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/Location.fxml"));
			stage.setScene(new Scene(root, 600, 500));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void toTutorial(ActionEvent event) {
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/Tutorial.fxml"));
			stage.setScene(new Scene(root, 600, 500));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void toHome(ActionEvent event) {
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/Home.fxml"));
			stage.setScene(new Scene(root, 600, 500));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void toSignUp(ActionEvent event) {
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/SignUp.fxml"));
			stage.setScene(new Scene(root, 600, 500));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void toManage(ActionEvent event) {
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("/Manage.fxml"));
			stage.setScene(new Scene(root, 600, 500));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}