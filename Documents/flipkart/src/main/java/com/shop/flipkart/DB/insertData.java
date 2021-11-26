package com.shop.flipkart.DB;
import java.util.ArrayList;
import java.util.List;
import com.shop.flipkart.*;
import com.shop.flipkart.Helpers.response;
import com.shop.flipkart.Helpers.user;
import com.shop.flipkart.Helpers.*;

public class insertData {
    static List<user> userList = new ArrayList<>();

    // Register
    public static response addUser(user u) {
        if(userList.add(u)) {
            return new response(200, "Registered User Successfully", u);
        }
        return new response(404, "Error Occured", null);
    }

    // Login
    public static response userLogin(authlogin credentials) {
        for (user usr : userList) {
            if(usr.getEmail().equals(credentials.getEmail()) && usr.getPassword().equals(credentials.getPassword())){
                return new response(200, "Logged in Successfully", usr);
            }
        }
        return new response(404, "User not Found", null);
    }

    public static response meow() {
        return new response(200, "Fetched All Users Successfully", userList);
    }
}
//git remote add origin https://github.com/Ganya-123/ecom.git