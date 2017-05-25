package id.co.mitschool.intentdemo;

/**
 * Created by kakaroto on 25/05/17.
 */

public class User {
    private String name;
    private String address;
    private String email;
    private String gender;

    public User(String name, String address, String email, String gender) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.gender = gender;
    }

    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
