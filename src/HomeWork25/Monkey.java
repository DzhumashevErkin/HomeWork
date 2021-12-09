package HomeWork25;

public class Monkey implements ClimbAble,EatFruits {
    private String name;
    private int age;
    private ClimbAble climbSomebody;

    @Override
    public void climb() {
        System.out.println("I am monkey, and I can climb");
    }

    @Override
    public void eatFruits() {
        System.out.println("I am monkey, and I eat fruits");
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", climbSomebody=" + climbSomebody +
                '}';
    }

    public Monkey() {
    }

    public Monkey(String name, int age, ClimbAble climbSomebody) {
        this.name = name;
        this.age = age;
        this.climbSomebody = climbSomebody;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ClimbAble getClimbSomebody() {
        return climbSomebody;
    }

    public void setClimbSomebody(ClimbAble climbSomebody) {
        this.climbSomebody = climbSomebody;
    }
}
