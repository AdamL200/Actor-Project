package blueprints.actor_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CoolProjectApplicationTests {


    @Test
    public void testActorGettersAndSetters(){
        Actor actor1 = new Actor();
        actor1.setActorid(5);
        Assertions.assertEquals(5,actor1.getActorid(), "Actor id error");
        actor1.setFirstname("Firstnametest");
        Assertions.assertEquals("Firstnametest",actor1.getFirstname(), "First name error");
        actor1.setLastname("Lastnametest");
        Assertions.assertEquals("Lastnametest",actor1.getLastname(), "Last name error");
    }

    @Test
    public void testError(){
        ActorNotFoundException exception1 = new ActorNotFoundException(3);

        String expectedMessage = "Could not find actor";
        String actualMessage = exception1.getMessage();

        Assertions.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testCategoryGettersAndSetters(){
        Category cat1 = new Category();
        cat1.setCatid(2);
        Assertions.assertEquals(2,cat1.getCatid(), "Category id error");
        cat1.setCatName("Action");
        Assertions.assertEquals("Action",cat1.getCatName(), "Category name error");

    }


}
