package beans;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Quote implements Serializable {
   private int id;
    private String content;
    private Author author;


}
