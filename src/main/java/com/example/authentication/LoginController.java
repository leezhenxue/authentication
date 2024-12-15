package com.example.authentication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginButton;

    @FXML
    private Hyperlink signUpLink;

    // Action for login button
    @FXML
    void click_login(ActionEvent event) {
        // Get the username and password text from the text fields
        String usernameText = username.getText();
        String passwordText = password.getText();

        // Example login validation (simple check, replace with your own logic)
        if (usernameText.equals("admin") && passwordText.equals("admin")) {
            showAlert(AlertType.INFORMATION, "Login Successful", "Welcome " + usernameText);
        } else {
            showAlert(AlertType.ERROR, "Login Failed", "Invalid username or password.");
        }
    }

    // Action for password field (currently does nothing, but can be used for validation)
    @FXML
    void click_password(ActionEvent event) {
        String passwordString = password.getText();
        // Optionally validate or handle the password input
    }

    // Action for sign up hyperlink (redirect to signup page or show sign-up message)
    @FXML
    void click_signup(ActionEvent event) {
        showAlert(AlertType.INFORMATION, "Sign Up", "Redirecting to sign up page...");
        // Redirect to sign-up page or handle sign-up logic
    }

    // Action for username field (currently does nothing, but can be used for validation)
    @FXML
    void click_username(ActionEvent event) {
        String usernameText = username.getText();
        // You can add logic to handle or validate the username input
    }

    // Utility method to show alerts
    private void showAlert(AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
