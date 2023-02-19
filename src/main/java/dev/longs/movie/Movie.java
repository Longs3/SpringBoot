package dev.longs.movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collation = "movies")     // This class represent every data in the collection
@Data       // make a getter and setter
@AllArgsConstructor     // Takes all the private field as parameter
@NoArgsConstructor      // Takes no parameter
public class Movie {

    @Id     // This should be unique in the database
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference      // This will call the database to restore only the database of the review
    private List<Review> reviewIds;


}
