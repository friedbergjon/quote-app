package dev.friedberg.quotes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Document(collection = "quotes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quote {
    @Id
    private ObjectId id;
    private String quote;
    private String author;
}
