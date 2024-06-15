package guru.springframework.spring6webapp.Controllers;

import guru.springframework.spring6webapp.services.AuthorService;
import guru.springframework.spring6webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/getAuthors")
    public String getAuthors(Model model)
    {
        model.addAttribute("authors" , authorService.findAll());

        return "author";
    }

}