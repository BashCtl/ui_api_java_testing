package entities;

import lombok.Data;

@Data
public class User implements Entity{

    private String username;
    private String password;
    private String role;
}
