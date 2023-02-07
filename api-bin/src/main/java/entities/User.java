package entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User implements Entity{
    private String name;
    private String email;
    private String password;
}
