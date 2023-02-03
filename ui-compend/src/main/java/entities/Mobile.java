package entities;

import lombok.Data;

@Data
public class Mobile implements Entity{

    private String mobileApp;
    private String mobileAppPrice;
    private String hybridApp;
    private String hybridAppPrice;
}
