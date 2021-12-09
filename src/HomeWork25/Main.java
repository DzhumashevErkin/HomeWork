package HomeWork25;

public class Main {
    public static void main(String[] args) {
        ClimbAble monkey1 = new Monkey();
        ((Monkey)monkey1).setAge(10);
        ((Monkey)monkey1).setName("Poko");
        Monkey monkey2 = new Monkey();
        monkey2.setAge(15);
        monkey2.setName("Popo");
        monkey2.setClimbSomebody(monkey1);
        System.out.println(monkey2);
        System.out.println(monkey1.getClass());
        System.out.println(monkey2 instanceof Monkey);

    }
}
