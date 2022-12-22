package blueprints.actor_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CoolProjectApplicationTests {


    @Test
    public void testGettersAndSetters(){
        Actor actor1 = new Actor();
        actor1.setActorid(5);
        Assertions.assertEquals(5,actor1.getActorid(), "Actor id error");
        actor1.setFirstname("Firstnametest");
        Assertions.assertEquals("Firstnametest",actor1.getFirstname(), "First name error");
        actor1.setLastname("Lastnametest");
        Assertions.assertEquals("Lastnametest",actor1.getLastname(), "Last name error");
    }

}
