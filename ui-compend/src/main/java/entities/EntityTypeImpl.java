package entities;

import lombok.Getter;

public enum EntityTypeImpl implements EntityType {

    USER("user.json", User.class),
    BILLING_ADDRESS("billing_address.json", BillingAddress.class),
    INSTALLATION("installation.json", Installation.class),
    LICENSE("license.json", License.class),
    MOBILE("mobile.json", Mobile.class);

    @Getter
    private final String file;
    @Getter
    private final Class<? extends Entity> classType;

    EntityTypeImpl(String fileType, Class<? extends Entity> classType) {
        this.file = fileType;
        this.classType = classType;
    }


}
