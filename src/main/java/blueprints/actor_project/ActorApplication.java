package blueprints.actor_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.ResourceAccessException;

@SpringBootApplication
@RestController
@RequestMapping("/home")
@CrossOrigin
public class ActorApplication {
	@Autowired
	private ActorRepository actorRepo;
	private FilmRepository filmRepo;
	private CityRepository cityRepo;


	public ActorApplication(ActorRepository ar, FilmRepository fr, CityRepository cr){
		actorRepo = ar;
		filmRepo = fr;
		cityRepo = cr;
	}
	public static void main(String[] args) {
		SpringApplication.run(ActorApplication.class, args);
	}
	@GetMapping("/actors")
	public @ResponseBody Iterable<Actor> getAllActors(){
		return actorRepo.findAll();
	}
	@GetMapping("/cities")
	public @ResponseBody Iterable<City> getAllCities(){
		return cityRepo.findAll();
	}
	@GetMapping("/actors/j")
	public @ResponseBody Iterable<Actor> getActorsJ(){
		return actorRepo.findActorsJ();
	}

	@GetMapping("/films")
	public @ResponseBody Iterable<Film> getAllFilms(){
		return filmRepo.findAll();
	}
	@GetMapping("/actors/{id}")
	public Actor getActor(@PathVariable int id) {

		return actorRepo.findById(id)
				.orElseThrow(() -> new ActorNotFoundException(id));
	}

	@GetMapping("/film_actors")
	public Iterable<Object> getFilmActors() {

		return filmRepo.findFilmActors();

	}
	@GetMapping("/films/{id}")
	public Film getFilm(@PathVariable int id) {

		return filmRepo.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Resource films/" + id + "could not be found"));
	}
	@GetMapping("/cities/{id}")
	public City getCity(@PathVariable int id) {

		return cityRepo.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Resource cities/" + id + "could not be found"));
	}
	@GetMapping("/get_actors/{id}")
	public Iterable<Actor> getActors(@PathVariable int id) {

		Film film1 = filmRepo.findById(id)
				.orElseThrow(() -> new ResourceAccessException("Resource films/" + id + "could not be found"));
		return film1.getActors();
	}
	@PostMapping("/actors")
	Actor newActor(@RequestBody Actor newActor) {
		return actorRepo.save(newActor);
	}
	@PostMapping("/cities")
	City newCity(@RequestBody City newCity) {
		return cityRepo.save(newCity);
	}
	@PostMapping("/films/{id}")
	Film newFilm(@RequestBody Film newFilm) {
		return filmRepo.save(newFilm);
	}
	@PutMapping("/actors/{id}")
	Actor replaceActor(@RequestBody Actor newActor, @PathVariable int id) {

		return actorRepo.findById(id)
				.map(actor -> {
					actor.setFirstname(newActor.getFirstname());
					actor.setLastname(newActor.getLastname());
					return actorRepo.save(actor);
				})
				.orElseGet(() -> {
					newActor.setActorid(id);
					return actorRepo.save(newActor);
				});
	}
	@PutMapping("/films/{id}")
	Film replaceFilm(@RequestBody Film newFilm, @PathVariable int id) {

		return filmRepo.findById(id)
				.map(film -> {
					film.setTitle(newFilm.getTitle());
					film.setDesc(newFilm.getDesc());
					film.setRate(newFilm.getRate());
					film.setLength(newFilm.getLength());
					film.setRating(newFilm.getRating());
					film.setYear(newFilm.getYear());
					film.setLang_id(newFilm.getLang_id());
					return filmRepo.save(film);
				})
				.orElseGet(() -> {
					newFilm.setFilmid(id);
					return filmRepo.save(newFilm);
				});
	}
	@PutMapping("/cities/{id}")
	City replaceCity(@RequestBody City newCity, @PathVariable int id) {

		return cityRepo.findById(id)
				.map(city -> {
					city.setCity(newCity.getCity());
					city.setCountryid(newCity.getCountryid());
					return cityRepo.save(city);
				})
				.orElseGet(() -> {
					newCity.setCityid(id);
					return cityRepo.save(newCity);
				});
	}
	@DeleteMapping("/actors/{id}")
	void deleteActor(@PathVariable int id) {
		actorRepo.deleteById(id);
	}
	@DeleteMapping("/films/{id}")
	void deleteFilm(@PathVariable int id) {
		filmRepo.deleteById(id);
	}
	@DeleteMapping("/cities/{id}")
	void deleteCity(@PathVariable int id) {
		cityRepo.deleteById(id);
	}
}
