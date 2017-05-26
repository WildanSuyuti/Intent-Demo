package id.co.mitschool.intentdemo;

import android.os.Parcel;
import android.os.Parcelable;

/*
* *
 * Created by kakaroto on 26/05/17.
 */

public class Person implements Parcelable{
    private String name;
    private String email;
    private String gender;

    public Person(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    protected Person(Parcel in) {
        name = in.readString();
        email = in.readString();
        gender = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(email);
        dest.writeString(gender);
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}
