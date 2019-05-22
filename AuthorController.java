package ac.za.cput.controller.people;

import ac.za.cput.domain.people.Author;
import ac.za.cput.service.people.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    @Qualifier("ServiceImpl")
    private AuthorService service;

    @PostMapping("/create")
    @ResponseBody
    public Author create(Author author) {
        return service.create(author);
    }

    @PostMapping("/update")
    @ResponseBody
    public Author update(Author author ) {
        return service.update(author);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Author read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Author> getAll() {
        return service.getAll();
    }
}
