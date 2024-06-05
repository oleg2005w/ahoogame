package student.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.lang.Iterable;

public class ServerAppHW {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        Player player1 = new Player("jon", 10);
        players.add(player1);

        Player player2 = new Player("pete", 100);
//   Verification duplicate user
//        for (Player pl1 : players){
//           if (pl1.getNickName().equals(player2.getNickName())){
//               System.out.println("Duplicate user");
//               break;
//           }else players.add(player2);
//        }while(it.hasNext()) {
//            if (player3.getNickName().equals(it.next().getNickName())){
//                System.out.println("Duplicate user");
//            }else players.add(player3);
//        }




        Player player3 = new Player("jon", 20);
//   Verification duplicate user
//        for (Player pl2 : players){
//            if (pl2.getNickName().equals(player3.getNickName())){
//                System.out.println("Duplicate user");
//                break;
//            }else players.add(player3);
//        }
        Iterator<Player> it = players.iterator();
        Player element = it.next();
        while(it.hasNext()) {
            if (player3.getNickName().equals(it.next().getNickName())){
                System.out.println("Duplicate user");
            }else players.add(player3);
        }
        System.out.println("----------" + player3.getNickName());
//        System.out.println("==========" + it.next().getNickName());


        Player player4 = new Player("mat", 90);
        System.out.println(player4.getNickName());
//        players.add(player4);
//        for (Player pl3 : players){
//            if (pl3.getNickName().equals("mat")){
//                System.out.println("Duplicate user");
//                break;
//            }else players.add(player4);
//        }



        System.out.println(players);
        System.out.println(players.size());


        CustomSet customSets = new CustomSet();
        customSets.add("11111");
        customSets.add("33333");
        customSets.add("22222");

        customSets.forEach(System.out::println);


        System.out.println(customSets);
    }

}
class CustomSet<T>{

    private Set<T> values;

    public CustomSet() {
        this.values = new HashSet<>();
    }

    public CustomSet(Set<T> values) {
        this.values = values;
    }

    public Set<T> getValues() {
        return values;
    }

    public void setValues(Set<T> values) {
        this.values = values;
    }
    public void add (T value){
        values.add(value);
    }

    @Override
    public String toString() {
        return "CustomSet{" +
                "values=" + values +
                '}';
    }
    public void forEach(Consumer<T> consumer){
        for (T values1 : values){
            consumer.accept(values1);
        }
    }
}