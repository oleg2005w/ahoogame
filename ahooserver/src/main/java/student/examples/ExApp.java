package student.examples;

import java.util.*;

public class ExApp {
    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();
        Player player1 = new Player("jon", 10);
        players.add(player1);

        Player player2 = new Player("pete", 100);
        players.add(player2);
        Iterator<Player> it = players.iterator();
        Player element = it.next();
//        while(it.hasNext()){
//            System.out.println("------" + it.next());
//        }
//        System.out.println(element);
//        it.next().getNickName();

//        for (Player pl1 : players){
//            if (pl1.getNickName().equals(player2.getNickName())){
//                System.out.println("Duplicate user");
//                break;
//            }else players.add(player2);
//        }
//        while(it.hasNext()) {
//            if (player2.getNickName().equals(it.next().getNickName())){
//                System.out.println("Duplicate user");
//            }else players.add(player2);
//        }

        Player player3 = new Player("jon", 20);

//        for (Player pl2 : players){
//            if (pl2.getNickName().equals(player3.getNickName())){
//                System.out.println("Duplicate user");
//                break;
//            }else players.add(player3);
//        }



        while(it.hasNext()) {
            if (player3.getNickName().equals(it.next().getNickName())){
                System.out.println("Duplicate user");
            }else players.add(player3);
        }



        Player player4 = new Player("mat", 90);
        System.out.println(player4.getNickName());
//        players.add(player4);
//        for (Player pl3 : players){
//            if (pl3.getNickName().equals("mat")){
//                System.out.println("Duplicate user");
//                break;
//            }else players.add(player4);
//        }

//        while(it.hasNext()){
//            System.out.println("------" + it.next());
//        }
//        for (int i = 0; i < 2; i++) {
//            System.out.println("+++++" + it.next());
//        }

        System.out.println(players);
        System.out.println(players.size());
    }
}
