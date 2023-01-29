package entities;

import lombok.Data;

@Data
public class BillingAddress implements Entity {

    private String companyName;
    private String firstAddress;
    private String secondAddress;
    private String city;
    private String state;
    private String postCode;
    private String country;
}
