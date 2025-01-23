package com.core.json;

import com.core.basic.bean.Login;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class JsonFileService {
    private final String filePath = "./src/main/resources/data.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Login> getAllLogins() throws IOException {
        return objectMapper.readValue(new File(filePath), new TypeReference<List<Login>>() {});
    }

    public Login getLoginById(int id) throws IOException {
        return getAllLogins().stream()
                .filter(Login -> Login.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void addLogin(Login newLogin) throws IOException {
        List<Login> Logins = getAllLogins();
        Logins.add(newLogin);
        objectMapper.writeValue(new File(filePath), Logins);
    }

    public void updateLogin(int id, Login updatedLogin) throws IOException {
        List<Login> Logins = getAllLogins();
        for (Login Login : Logins) {
            if (Login.getId() == id) {
                Login.setName(updatedLogin.getName());
                break;
            }
        }
        objectMapper.writeValue(new File(filePath), Logins);
    }

    public void deleteLogin(int id) throws IOException {
        List<Login> Logins = getAllLogins();
        Logins.removeIf(Login -> Login.getId() == id);
        objectMapper.writeValue(new File(filePath), Logins);
    }
}

