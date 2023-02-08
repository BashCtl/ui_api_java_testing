package entities;

public interface EntityType {
    String getFile();
    Class<? extends Entity> getClassType();
}
