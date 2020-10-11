package HW;

public class Person {
    private String name;
    private String lastName;
    private String email;
    private int age;

    public Person(String name, String lastName, String email, int age){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HW.Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

}
