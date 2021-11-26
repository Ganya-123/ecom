package com.shop.flipkart.Controller.Auth;

import com.shop.flipkart.DB.insertData;
import com.shop.flipkart.Helpers.response;
import com.shop.flipkart.Helpers.user;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class registerController {
    @PostMapping("/register")
    public response register(@RequestBody user u) {
        return insertData.addUser(u);
    }
}

    