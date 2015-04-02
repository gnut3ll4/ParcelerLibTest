package com.gnut3ll4.parcelertest;

import org.parceler.Parcel;

/**
 * Created by gnut3ll4 on 01/04/15.
 */
@Parcel
public class User {

    String nom;
    int age;
    String telephone;

    public User(){}

    public User(String nom, int age, String telephone) {
        this.nom = nom;
        this.age = age;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
