package beans;

import lombok.*;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Album implements Serializable {
    private int id;
    private String artist;
    private String albumName;
    private int realeaseDate;
    private double sales;
    private String genre;




}
