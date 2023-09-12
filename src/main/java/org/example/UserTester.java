package org.example;

import com.google.gson.Gson;

public class UserTester {
    public static void main(String[] args) {
        User user1=new User("Mykola","Tymashov");
        String Mykola=new Gson().toJson(user1);
        System.out.println(Mykola);
    }
}
