package guru.springframework.spring6webapp.Controllers;

import guru.springframework.spring6webapp.services.BookService;
import guru.springframework.spring6webapp.services.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/getBooks")
    public String getBooks(Model model)
    {
        model.addAttribute("books", bookService.findAll());

        return "books";
    }
}
