package wooteco.chess.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import wooteco.chess.model.Book;
import wooteco.chess.service.LibraryService;

@Controller
public class LibraryController {

    private LibraryService libraryService;

    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();

        List<Book> books = libraryService.loadAllBooks();

        modelAndView.addObject("books", books);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @PostMapping("/add-book")
    public String addBook(@RequestParam("name") String name, @RequestParam("author") String author) {
        libraryService.addBook(name, author);
        return "redirect:/";
    }
}
