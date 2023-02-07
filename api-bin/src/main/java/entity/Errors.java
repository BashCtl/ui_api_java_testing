package entity;

import entities.Entity;
import lombok.Data;

@Data
public class Errors implements Entity {
    private String success;
    private String registeredEmailErr;
}
