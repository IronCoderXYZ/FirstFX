package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Person;

public class MainWindowControllerOld {
    
    // Views
    @FXML private Label label;
    @ FXML private TextField textField;
    
    private FirstFX firstFX;
    private Person person;
    
    public void setFirstFX(FirstFX firstfX) {
        this.firstFX = firstFX;
        person = new Person("Jack", "White", "22");
    }
    
    public void handleButton() {
        String text = textField.getText();
        person.setFirstName("Anna");
        label.setText(person.getFirstName());
        textField.clear();
    }
    
}
