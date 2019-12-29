package Externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class User implements Externalizable {

    private String userName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private int age;
    private String gender;

    public User(){

    }


    public User(String userName,String password, int age,String gender){
        this.userName=userName;
        this.password=password;
        this.age=age;
        this.gender=gender;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(userName);
        out.writeInt(age);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        userName= (String) in.readObject();
        age = in.readInt();

    }
}