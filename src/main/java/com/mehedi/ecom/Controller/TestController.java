package com.mehedi.ecom.Controller;

import com.mehedi.ecom.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/api/")
public class TestController {


    List<User> users = new ArrayList<User>();

    @GetMapping("users")
    public List<User> getAllSUsers() {


        for (int i = 0; i < 100; i++) {
            users.add(new User("Masum", 50));
        }


        return users;
    }


    @GetMapping("msg")
    public String getMessage() {


        return "Data coming from Backend";
    }

    @GetMapping("love")
    public String getMessageLove() {
        return "i Love You";
    }


}
