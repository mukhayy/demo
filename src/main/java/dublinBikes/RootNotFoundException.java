package dublinBikes;

public class RootNotFoundException extends RuntimeException {

    RootNotFoundException(Long id) {
        super("Could not find root " + id);
    }

}
