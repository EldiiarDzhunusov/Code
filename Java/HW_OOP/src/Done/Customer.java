package Done;

public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private String cardNumber;
    private int pin;
    private String username;
    private String password;

    public Customer(String firstName, String lastName, String address, String cardNumber, int pin, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;

        if (isValidPassword(password)){
            this.password = password;
        }
        else{
            this.password = "DefaultPassword@20";
        }
    }
    public Customer(String firstName, String lastName, String address, String cardNumber, int pin, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)){
            this.password = password;
        }
        else{
            this.password = "DefaultPassword@20";
        }

    }

    @Override
    public String toString() {
        return "Done.PS07.Customer [" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", pin='" + pin + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ']';
    }
    public boolean isValidPassword(String password){
        boolean numChar=false;
        boolean lower=false;
        boolean upper=false;
        boolean special=false;
        boolean len=false;
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                numChar = true;
            }
            if(Character.isLowerCase(password.charAt(i))){
                lower = true;
            }
            if(Character.isUpperCase(password.charAt(i))){
                upper = true;
            }
            if(password.charAt(i)=='@' || password.charAt(i)=='#' || password.charAt(i)=='$' || password.charAt(i)=='%'){
                special = true;
            }
        }
        if (password.length()>=8 || password.length()<=20){
            len=true;
        }
        return ( numChar && lower && upper && special && len);

    }
    public String generatePassword(){
        String password = "";
        password +=Character.toString((char) Math.random() * (58 - 48 + 1) + 48); //numeric
        password += "_";
        password +=Character.toString((char) Math.random() * (91 - 65 + 1) + 65);
        password +=Character.toString((char) Math.random() * (38 - 35 + 1) + 35);
        while(password.length()<12){
            password += Character.toString((char) Math.random() * (123 - 97 + 1) + 97);
        }

        return password;
    }
}

