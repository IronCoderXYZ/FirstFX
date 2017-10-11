package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Person;

public class MainWindowController {
    
    // Views
    @FXML TableView tableView;
    @FXML TableColumn<Person, String> fNameColumn;
    @FXML TableColumn<Person, String> lNameColumn;
    @FXML TableColumn<Person, String> ageColumn;
    
    private FirstFX firstFX;
    private ObservableList<Person> personList = FXCollections.observableArrayList();
    private Stage primaryStage;
    
    public void initialize() {
        fNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
        lNameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("age"));
    }
    
    public void setFirstFX(FirstFX firstFX, Stage primaryStage) {
        this.firstFX = firstFX;
        this.primaryStage = primaryStage;
        setData();
        tableView.setItems(personList);
    }
    
    public void setData() {
        personList.add(new Person("Mike", "Bowser", "25"));
        personList.add(new Person("Karl", "Fike", "35"));
        personList.add(new Person("Marika", "Falla", "32"));
        personList.add(new Person("Sally", "Brown", "45"));
    }
    
    public void closePressed() {
       primaryStage.close();
    }
}
