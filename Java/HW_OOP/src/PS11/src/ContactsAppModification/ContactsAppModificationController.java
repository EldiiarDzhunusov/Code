package ContactsAppModification;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ContactsAppModificationController {

    @FXML    private ListView<Contact> booksListView;
    @FXML    private ImageView coverImageView;
    private Contact contactCurrent;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label emailLabel;

    @FXML
    private Label phoneNumberLabel;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private Button addButton;

    @FXML
    private Button deleteButton;

    @FXML
    private Button updateButton;

    @FXML
    void addButtonPressed(ActionEvent event) {
        try{
            if (validationFailed()){
                throw new NumberFormatException();
            }
            else{
                Contact obj1 = new Contact();
                obj1.setFirstName(firstNameTextField.getText());
                obj1.setLastName(lastNameTextField.getText());
                obj1.setEmail(emailTextField.getText());
                obj1.setPhoneNumber(phoneNumberTextField.getText());
                obj1.setImage("ContactsAppModification/Images/img5.jpg");
                contacts.add(obj1);
            }
        } catch (Exception ex){
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            emailTextField.setText("");
            phoneNumberTextField.setText("");
            firstNameTextField.requestFocus();
        }
    }

    @FXML
    void deleteButtonPressed(ActionEvent event) {
        try {
            contacts.remove(contactCurrent);
        }
        catch (Exception ex){
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            emailTextField.setText("");
            phoneNumberTextField.setText("");
            firstNameTextField.requestFocus();
        }
    }

    @FXML
    void updateButtonPressed(ActionEvent event) {
        try{
            if (validationFailed()){
                throw new NumberFormatException();
            }
            else{
                ContactsApp.Contact obj1 = new ContactsApp.Contact();
                contactCurrent.setFirstName(firstNameTextField.getText());
                contactCurrent.setLastName(lastNameTextField.getText());
                contactCurrent.setEmail(emailTextField.getText());
                contactCurrent.setPhoneNumber(phoneNumberTextField.getText());

            }
        } catch (Exception ex){
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            emailTextField.setText("");
            phoneNumberTextField.setText("");
            firstNameTextField.requestFocus();
        }
    }
    public boolean validationFailed() {
        return (firstNameTextField.getText().trim().equals("") ||
                lastNameTextField.getText().trim().equals("") ||
                emailTextField.getText().trim().equals("") ||
                phoneNumberTextField.getText().trim().equals(""));
    }

    private final ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public void initialize(){
        contacts.add(new Contact("Eldiiar","Dzhunusov","Edliiar@UCA.com","0411242143", "ContactsAppModification/Images/img1.jpg"));
        contacts.add(new Contact("Alphonse ","Elric","Alphonse@alchemist.com","07784321423", "ContactsAppModification/Images/img2.jpg"));
        contacts.add(new Contact("Gevin","Belson","GavinTheBest@Hooli.com","41654645468468", "ContactsAppModification/Images/img3.jpg"));
        contacts.add(new Contact("Levi","Ackerman","Levi@titan.com","77777777777777777", "ContactsAppModification/Images/img4.jpg"));

        booksListView.setItems(contacts);

        booksListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Contact>() {
            @Override
            public void changed(ObservableValue<? extends Contact> observableValue, Contact oldValue, Contact newValue) {
                contactCurrent =newValue;
                coverImageView.setImage(new Image(newValue.getImage()));
                firstNameTextField.setText(newValue.getFirstName());
                lastNameTextField.setText(newValue.getLastName());
                emailTextField.setText(newValue.getEmail());
                phoneNumberTextField.setText(newValue.getPhoneNumber());
            }
        });
    }


}
