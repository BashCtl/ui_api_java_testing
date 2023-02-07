package tests;

import entity.Errors;
import org.testng.annotations.BeforeMethod;

import static entities.EntityProvider.getEntity;
import static entity.EntityTypeImpl.ERRORS;

public abstract class BaseTest {

    protected Errors errors = getEntity(ERRORS);
    @BeforeMethod
    public void beforeMethod(){

    }
}
