package student.examples;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Player implements Serializable {
    private final static long serialVersionUID = 1L;
    private String nickName;
    private int score;

//    public Player(String nickName, int score) {
//        this.nickName = nickName;
//        this.score = score;
//    }

}
