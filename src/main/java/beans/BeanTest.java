package beans;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album whiteAlbum = new Album();
        whiteAlbum.setId(1);
        whiteAlbum.setAlbumName("The White Album");
        whiteAlbum.setArtist("The Beatles");
        whiteAlbum.setGenre("Rock");
        whiteAlbum.setRealeaseDate(1970);
        whiteAlbum.setSales(20000000.99);
        System.out.println(whiteAlbum);


        Author rocky = new Author();
        rocky.setId(2);
        rocky.setFirstName("Rocky");
        rocky.setLastName("Balboa");

        Author matt = new Author();
        matt.setId(3);
        matt.setLastName("Matt");
        matt.setLastName("Damon");

        Quote firstQuote = new Quote();
        firstQuote.setAuthor(rocky);
        firstQuote.setContent("It ain't about how hard you hit its about how ard you can get hit and keep moving forward.");

        Quote secondQuote = new Quote();
        secondQuote.setAuthor(matt);
        secondQuote.setContent("sometimes all you need is 20 seconds of insane stupid courage and I promise, something great will happen");


        ArrayList <Quote> quotes = new ArrayList<>();

        quotes.add(firstQuote);
        quotes.add(secondQuote);

        for (Quote quote : quotes) {
            System.out.println(quote);
        }



    }
}
