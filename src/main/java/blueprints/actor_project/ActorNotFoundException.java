package blueprints.actor_project;

public class ActorNotFoundException extends RuntimeException{
    ActorNotFoundException(int id) {
        super("Could not find actor " + id);
    }
}
