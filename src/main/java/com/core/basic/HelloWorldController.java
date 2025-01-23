package com.core.basic;

import com.core.basic.bean.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloWorldController {


    @GetMapping("home")
    public String  readEmployee() {
        return "home";
    }

    @PostMapping("insert")
    public void  readEmployee(Login login) {



    }





}
