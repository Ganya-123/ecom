



package com.shop.flipkart.Controller.Auth;

import com.shop.flipkart.*;
import com.shop.flipkart.Helpers.response;
import com.shop.flipkart.DB.insertData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shop.flipkart.Helpers.*;
@RestController
@RequestMapping("/auth")
public class loginController {

    @PostMapping("/login")
    public response login(@RequestBody authlogin credentials) {
        return insertData.userLogin(credentials);
    }

    @GetMapping("/allUser")
    public response getallUsers() {
        return insertData.meow();
    }
}