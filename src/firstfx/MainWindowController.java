/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author mitch
 */
public class MainWindowController {
    
    // Views
    @FXML private Label label;
    @ FXML private TextField textField;
    
    private FirstFX firstFX;
    
    public void setFirstFX(FirstFX firstfX) {
        this.firstFX = firstFX;
    }
    
    public void handleButton() {
        String text = textField.getText();
        label.setText(text);
        textField.clear();
    }
    
}
