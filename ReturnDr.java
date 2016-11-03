package com.example.abans_000.docplus;

/**
 * Created by abans_000 on 03-11-2016.
 */
public class ReturnDr {
    private int _age;
    private String _name,_mobile,_sex;
    private boolean _stat;

    public ReturnDr(){

    }

    public ReturnDr(int _age, String _name, String _mobile, String _sex, boolean _stat) {
        this._age = _age;
        this._name = _name;
        this._mobile = _mobile;
        this._sex = _sex;
        this._stat = _stat;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_mobile(String _mobile) {
        this._mobile = _mobile;
    }

    public void set_sex(String _sex) {
        this._sex = _sex;
    }

    public void set_stat(boolean _stat) {
        this._stat = _stat;
    }

    public int get_age() {
        return _age;
    }

    public String get_name() {
        return _name;
    }

    public String get_mobile() {
        return _mobile;
    }

    public String get_sex() {
        return _sex;
    }

    public boolean is_stat() {
        return _stat;
    }
}
