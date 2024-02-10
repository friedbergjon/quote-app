package dev.friedberg.quotes;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QuoteRepository extends MongoRepository<Quote, ObjectId> {
  Optional<Quote> findQuoteByAuthor(String author);
}
