package com.codegym.model;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(16);
        u1.setName("Hoang");
        u1.setAccount("hoang");
        u1.setEmail("hoang@gmail.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(19);
        u2.setName("Quy");
        u2.setAccount("quy");
        u2.setEmail("quy@gmail.com");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Duc");
        u3.setAccount("duc");
        u3.setEmail("duc@gmail.com");
        u3.setPassword("123456");
        users.add(u3);

        User u4 = new User();
        u4.setAge(14);
        u4.setName("Hau");
        u4.setAccount("hau");
        u4.setEmail("hau@gmail.com");
        u4.setPassword("123456");
        users.add(u4);
    }

    public static User checkLogin(Login login) {
        for (User u:users) {
            if (u.getAccount().equals(login.getAccount()) && u.getPassword().equals(login.getPassword())) {
                return u;
            }
        }
        return null;
    }
}
