package com.example.abans_000.docplus;

/**
 * Created by abans_000 on 02-11-2016.
 */
public class EmergencyDB {
    private int _id,_age;
    private String _sex,_dob,_address,_mobile,_condition,_history,_namevisit,_relation,_mobvisit,_name;

    public EmergencyDB(){

    }

    public EmergencyDB(int _age, String _sex, String _dob, String _address, String _mobile, String _condition, String _history, String _namevisit, String _relation, String _mobvisit, String _name) {
        this._age = _age;
        this._sex = _sex;
        this._dob = _dob;
        this._address = _address;
        this._mobile = _mobile;
        this._condition = _condition;
        this._history = _history;
        this._namevisit = _namevisit;
        this._relation = _relation;
        this._mobvisit = _mobvisit;
        this._name = _name;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public void set_age(int _age) {
        this._age = _age;
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

    public void set_condition(String _condition) {
        this._condition = _condition;
    }

    public void set_history(String _history) {
        this._history = _history;
    }

    public void set_namevisit(String _namevisit) {
        this._namevisit = _namevisit;
    }

    public void set_relation(String _relation) {
        this._relation = _relation;
    }

    public void set_mobvisit(String _mobvisit) {
        this._mobvisit = _mobvisit;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public int get_id() {
        return _id;
    }

    public int get_age() {
        return _age;
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

    public String get_condition() {
        return _condition;
    }

    public String get_history() {
        return _history;
    }

    public String get_namevisit() {
        return _namevisit;
    }

    public String get_relation() {
        return _relation;
    }

    public String get_mobvisit() {
        return _mobvisit;
    }

    public String get_name() {
        return _name;
    }
}
