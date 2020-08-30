package com.company;

import java.util.Date;


public class User {

    int Id;
    String Name;
    String Password;
    Date CreateDate;
    Date ModifyDate;

    public User(String name, String password) {
        Id = Repository.GetId();
        Name = name;
        Password = password;
        CreateDate = new Date();
        ModifyDate = CreateDate;
    }

    @Override
    public String toString() {
        return Id + " " + Name + " " +Password;
    }
}

