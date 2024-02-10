package dev.friedberg.quotes;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuoteService {
    @Autowired
    private QuoteRepository quoteRepository;

    public List<Quote> allQuotes() {
        return quoteRepository.findAll();
    }

    public Optional<Quote>singleQuote(String author) {
        return quoteRepository.findQuoteByAuthor(author);
    }
}
