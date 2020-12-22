package ContactsApp;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ContactsAppController {
    private ObservableList<Contact> contacts = FXCollections.observableArrayList();
    private Contact contactSelected;

    @FXML
    private ListView<Contact> ContactsListView;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField phoneNumberTextField;

    public void initialize(){
        contacts.add(new Contact("Eldiiar","Dzhunusov","eldiiar.dzhunusov@gmail.com","+996123123123"));
        contacts.add(new Contact("Gavin","Belson","CEO@hooli.com","+555555555554"));
        contacts.add(new Contact("Alphonse","Elric","Alchmist@anotherword.com","7894561233331542"));
        ContactsListView.setItems(contacts);
        ContactsListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Contact>() {
            @Override
            public void changed(ObservableValue<? extends Contact> arg0, Contact oldValue, Contact newValue) {
                contactSelected = newValue;
                firstNameTextField.setText(newValue.getFirstName());
                lastNameTextField.setText(newValue.getLastName());
                emailTextField.setText(newValue.getEmail());
                phoneNumberTextField.setText(newValue.getPhoneNumber());
            }
        });
    }

    public boolean validationFailed() {
        return (firstNameTextField.getText().trim().equals("") ||
                lastNameTextField.getText().trim().equals("") ||
                emailTextField.getText().trim().equals("") ||
                phoneNumberTextField.getText().trim().equals(""));
    }
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
            contacts.remove(contactSelected);
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
                Contact obj1 = new Contact();
                contactSelected.setFirstName(firstNameTextField.getText());
                contactSelected.setLastName(lastNameTextField.getText());
                contactSelected.setEmail(emailTextField.getText());
                contactSelected.setPhoneNumber(phoneNumberTextField.getText());

            }
        } catch (Exception ex){
            firstNameTextField.setText("");
            lastNameTextField.setText("");
            emailTextField.setText("");
            phoneNumberTextField.setText("");
            firstNameTextField.requestFocus();
        }
    }

}
