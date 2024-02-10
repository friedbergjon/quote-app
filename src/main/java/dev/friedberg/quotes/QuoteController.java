package dev.friedberg.quotes;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/quotes")
public class QuoteController {
    @Autowired
    private QuoteService quoteService;
    @GetMapping
    public ResponseEntity<List<Quote>> getAllQuotes() {
        return new ResponseEntity<List<Quote>>(quoteService.allQuotes(), HttpStatus.OK);
    }
    @GetMapping("/{author}")
    public ResponseEntity<Optional<Quote>> getSingleQuote(@PathVariable String author) {
        return new ResponseEntity<Optional<Quote>>(quoteService.singleQuote(author), HttpStatus.OK);
    }
}
