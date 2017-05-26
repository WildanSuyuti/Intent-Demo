package id.co.mitschool.intentdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kakaroto on 25/05/17.
 */

public class User implements Parcelable {
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

    public User() {
    }

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.address);
        dest.writeString(this.email);
        dest.writeString(this.gender);
    }

    protected User(Parcel in) {
        this.name = in.readString();
        this.address = in.readString();
        this.email = in.readString();
        this.gender = in.readString();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String info() {
        return "Nama: " + name + " Email: " + email + " " +
                "\nAddress: " + address + " Gender: " + gender;
    }
}
