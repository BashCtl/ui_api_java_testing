package tests;

import entity.Messages;
import org.testng.annotations.BeforeMethod;

import static entities.EntityProvider.getEntity;
import static entity.EntityTypeImpl.MESSAGES;

public abstract class BaseTest {

    protected Messages messages = getEntity(MESSAGES);
    @BeforeMethod
    public void beforeMethod(){

    }
}
