import java.util.*;

class Friend {

    int id;
    String name;

    Friend(int id, String name) {

        this.id = id;
        this.name = name;

    }

}

public class FriendList {

    public static void main(String[] args) {

        ArrayList<Friend> list = new ArrayList<>();

        list.add(new Friend(1, "Alice"));
        list.add(new Friend(2, "Bob"));
        list.add(new Friend(3, "Charlie"));

        for(Friend f : list) {

            System.out.println(f.id + " " + f.name);

        }

    }
}