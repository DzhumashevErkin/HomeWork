package Test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> string3 = new ArrayList<String>();
        string3.add("q1");
        string3.add("q2");
        string3.add("q3");
        System.out.println(string3);

        string3.set(1, "q4");
        System.out.println(string3);


        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(linkedList.size() - 2);
        System.out.println(linkedList);


        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        if (hashSet.contains(30)) {
            hashSet.remove(0);
        }
        hashSet.add(30);
        hashSet.add(40);
        System.out.println(hashSet.size());
    }

}





