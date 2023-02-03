package entities;

import lombok.Data;

@Data
public class User implements Entity{

    private String firstName;
    private String lastName;
    private String email;
    private int dialCode;
    private String phoneNumber;
    private String mobilePhone;
    private String password;
    private String role;
    private String subject;
    private String message;
}
