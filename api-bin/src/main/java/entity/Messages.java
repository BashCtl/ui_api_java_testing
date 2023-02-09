package entity;

import entities.Entity;
import lombok.Data;

@Data
public class Messages implements Entity {
    private String success;
    private String registeredEmailErr;
    private String invalidCredentialsErr;
    private String errOccurred;
    private String invalidRequest;
}
