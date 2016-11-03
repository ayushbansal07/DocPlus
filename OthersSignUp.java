package com.example.abans_000.docplus;

/**
 * Created by abans_000 on 01-11-2016.
 */
public class OthersSignUp {
    //public String Id,Name,Email,Password,Sex,DOB,Address,Mobile;
    //public int age;

    private int _id,_age;
    private String _name,_email,_password,_sex,_dob,_address,_mobile;

    public OthersSignUp(){

    }


    public OthersSignUp(int _age, String _name, String _email, String _password, String _sex, String _dob, String _address, String _mobile) {
        this._age = _age;
        this._name = _name;
        this._email = _email;
        this._password = _password;
        this._sex = _sex;
        this._dob = _dob;
        this._address = _address;
        this._mobile = _mobile;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_email(String _email) {
        this._email = _email;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public void set_sex(String _sex) {
        this._sex = _sex;
    }

    public void set_dob(String _dob) {
        this._dob = _dob;
    }

    public void set_address(String _address) {
        this._address = _address;
    }

    public void set_mobile(String _mobile) {
        this._mobile = _mobile;
    }

    public int get_id() {
        return _id;
    }

    public int get_age() {
        return _age;
    }

    public String get_name() {
        return _name;
    }

    public String get_email() {
        return _email;
    }

    public String get_password() {
        return _password;
    }

    public String get_sex() {
        return _sex;
    }

    public String get_dob() {
        return _dob;
    }

    public String get_address() {
        return _address;
    }

    public String get_mobile() {
        return _mobile;
    }
}
