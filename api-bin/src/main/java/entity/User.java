package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import entities.Entity;




@Data
@AllArgsConstructor
public class User implements Entity {
    private String name;
    private String email;
    private String password;
}
