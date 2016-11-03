package com.example.abans_000.docplus;

/**
 * Created by abans_000 on 02-11-2016.
 */
public class DrSignUpDB {
    private int _id,_age;
    private String _hospid,_reg,_name,_email,_password,_sex,_dob,_address,_mob1,_mob2,_degree;

    public void DrSignUpDB(){

    }

    public DrSignUpDB(int _age, String _hospid, String _reg, String _name, String _email, String _password, String _sex, String _dob, String _address, String _mob1, String _mob2, String _degree) {
        this._age = _age;
        this._hospid = _hospid;
        this._reg = _reg;
        this._name = _name;
        this._email = _email;
        this._password = _password;
        this._sex = _sex;
        this._dob = _dob;
        this._address = _address;
        this._mob1 = _mob1;
        this._mob2 = _mob2;
        this._degree = _degree;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public void set_hospid(String _hospid) {
        this._hospid = _hospid;
    }

    public void set_reg(String _reg) {
        this._reg = _reg;
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

    public void set_mob1(String _mob1) {
        this._mob1 = _mob1;
    }

    public void set_mob2(String _mob2) {
        this._mob2 = _mob2;
    }

    public void set_degree(String _degree) {
        this._degree = _degree;
    }

    public int get_id() {
        return _id;
    }

    public int get_age() {
        return _age;
    }

    public String get_hospid() {
        return _hospid;
    }

    public String get_reg() {
        return _reg;
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

    public String get_mob1() {
        return _mob1;
    }

    public String get_mob2() {
        return _mob2;
    }

    public String get_degree() {
        return _degree;
    }
}
