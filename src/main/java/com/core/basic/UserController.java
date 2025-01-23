package com.core.basic;

import com.core.basic.bean.Login;
import com.core.json.JsonFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private JsonFileService jsonFileService;

    @GetMapping
    public List<Login> getAllLogins() throws IOException {
        return jsonFileService.getAllLogins();
    }

    @GetMapping("/{id}")
    public Login getLoginById(@PathVariable int id) throws IOException {
        return jsonFileService.getLoginById(id);
    }

    @PostMapping
    public void addLogin(@RequestBody Login Login) throws IOException {
        jsonFileService.addLogin(Login);
    }

    @PutMapping("/{id}")
    public void updateLogin(@PathVariable int id, @RequestBody Login Login) throws IOException {
        jsonFileService.updateLogin(id, Login);
    }

    @DeleteMapping("/{id}")
    public void deleteLogin(@PathVariable int id) throws IOException {
        jsonFileService.deleteLogin(id);
    }
}

