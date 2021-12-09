package HomeWork26;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Cat cat = new Cat();
        Duck duck = new Duck();
        Parrot parrot = new Parrot();
        Person person = new Person();
        Shark shark = new Shark();
        Ship ship = new Ship();
        Whale whale = new Whale();

        FlyAble[] flyAbles = {airplane,duck,parrot};
        RunAble[] runAbles = {cat,person};
        SwimAble[] swimAbles = {duck,person,shark,ship,whale};
        FlyAble.justFlyers(flyAbles);
        RunAble.justRunners(runAbles);
        SwimAble.justSwimmers(swimAbles);
    }
}
