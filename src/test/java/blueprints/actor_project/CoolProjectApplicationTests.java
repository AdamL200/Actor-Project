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

    @Test
    public void testCityGettersAndSetters(){
        City city1 = new City();
        city1.setCityid(50);
        Assertions.assertEquals(50,city1.getCityid(), "City id error");
        city1.setCountryid(9);
        Assertions.assertEquals(9,city1.getCountryid(), "Country id error");
        city1.setCity("Cool city");
        Assertions.assertEquals("Cool city",city1.getCity(), "City name error");

    }

    @Test
    public void testFilmGettersAndSetters(){
        Film film1 = new Film();
        film1.setFilmid(10);
        Assertions.assertEquals(10,film1.getFilmid(), "Film id error");
        film1.setDesc("This is a film test");
        Assertions.assertEquals("This is a film test",film1.getDesc(), "Film Description error");
        film1.setRate(2.5);
        Assertions.assertEquals(2.5,film1.getRate(), "Film rate error");
        film1.setRating("Poor");
        Assertions.assertEquals("Poor",film1.getRating(), "Film rating error");
        film1.setLength(125);
        Assertions.assertEquals(125,film1.getLength(), "Film Length error");
        film1.setTitle("Film Title Test");
        Assertions.assertEquals("Film Title Test",film1.getTitle(), "Film Title error");
        film1.setYear(2005);
        Assertions.assertEquals(2005,film1.getYear(), "Film Year error");
        film1.setLang_id(2);
        Assertions.assertEquals(2,film1.getLang_id(), "Film Language id error");

    }
    @Test
    public void testFilmActorGettersAndSetters(){
        Actor actor2 = new Actor();
        actor2.setActorid(4);
        Film film2 = new Film();
        film2.setFilmid(6);
        FilmActor fa1 = new FilmActor();
        fa1.setFilmID(film2);
        Assertions.assertNotNull(fa1.getFilmID(), "FA film-id error");
        fa1.setActorID(actor2);
        Assertions.assertNotNull(fa1.getActorID(), "FA actor-id error");

    }

}
