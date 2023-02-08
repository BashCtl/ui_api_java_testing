package entity;

import entities.Entity;
import entities.EntityType;
import lombok.Getter;

public enum EntityTypeImpl implements EntityType {
    USER("user.json", User.class),
    MESSAGES("messages.json", Messages.class);


    @Getter
    private final String file;
    @Getter
    private final Class<? extends Entity> classType;

    EntityTypeImpl(String file, Class<? extends Entity> classType) {
        this.file = file;
        this.classType = classType;
    }
}
