package entities;

import lombok.Data;

@Data
public class License implements Entity{

    private String addLicense;
    private String addLicensePrice;
    private String multiLicense;
    private String multiLicensePrice;
}
