package dublinBikes;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
class RootController {

    private final RootRepository repository;

    RootController(RootRepository repository) {
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/schema")
    List<Root> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]


    @GetMapping("/data/{id}")
    Root one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RootNotFoundException(id));
    }

    @DeleteMapping("/data/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}