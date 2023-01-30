package entities;

import lombok.Getter;

public enum EntityType {

    USER("user.json", User.class),
    BILLING_ADDRESS("billing_address.json", BillingAddress.class);

    @Getter
    private final String fileType;
    @Getter
    private final  Class<? extends Entity> classType;

    EntityType(String fileType, Class<? extends Entity> classType){
        this.fileType = fileType;
        this.classType = classType;
    }


}