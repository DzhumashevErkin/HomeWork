package HomeWork29;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class A {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        List<String> myList2 = new ArrayList<>();
        myList.add("Ветер с моря дул");
        myList.add("Нагонял беду");
        myList.add("И сказал ты мне");
        myList.add("Больше не приду");
        myList.addAll(myList);
        for (int i = 0;i<myList.size();i++) {
            if(myList.get(i).length() >=15) {
                myList2.add(myList.get(i));
                myList.remove(i);
            }
        }

        myList2.removeIf(s -> Objects.equals(s, "И сказал ты мне"));
        System.out.println(myList);
        System.out.println(myList2);

    }
}
