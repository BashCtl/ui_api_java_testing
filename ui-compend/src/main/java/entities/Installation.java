package entities;

import lombok.Data;

@Data
public class Installation implements Entity {
    private String appInstallTitle;
    private String appInstallPrice;
    private String troubleshoot;
    private String troubleshootPrice;
    private String upgradeTitle;
    private String upgradePrice;
}
