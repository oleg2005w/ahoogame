package student.examples;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

//@Data
//@AllArgsConstructor
public class Player implements Serializable {
    private final static long serialVersionUID = 1L;
    private String nickName;
    private int score;

    public Player(String nickName, int score) {
        this.nickName = nickName;
        this.score = score;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nickName='" + nickName + '\'' +
                ", score=" + score +
                '}';
    }
}
