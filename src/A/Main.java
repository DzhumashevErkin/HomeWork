package A;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(6);
        cat.setBreed("Munchkin");
        cat.setName("Deimon");
        cat.setAmountOfScratchedFurniture(3);
        System.out.printf("Имя кошки: %s, возраст кошки: %d лет, порода кошки: %s, количество расцарапонной мебели: %d\n",
                cat.getName(), cat.getAge(), cat.getBreed(), cat.getAmountOfScratchedFurniture());
        Dog dog = new Dog();
        dog.setAge(5);
        dog.setBreed("Mops");
        dog.setName("Cherchil");
        dog.setIsTame(false);
        System.out.printf("Имя собаки: %s, возраст собаки: %d лет, порода собаки: %s, приручена ли собака: %b\n",
                dog.getName(), dog.getAge(), dog.getBreed(), dog.getIsTame());
        Fish fish = new Fish();
        fish.setAge(1);
        fish.setBreed("Golden");
        fish.setName("Carl");
        fish.setImmersionDepthMeter(205.3);
        System.out.printf("Имя рыбки: %s, возраст рыбки: %d год, порода рыбки: %s, глубина погружения рыбки: %.1f метров\n",
                fish.getName(), fish.getAge(), fish.getBreed(), fish.getImmersionDepthMeter());
        Parrot parrot = new Parrot();
        parrot.setAge(2);
        parrot.setBreed("Amazon");
        parrot.setName("Timoti");
        parrot.setVocabulary(7);
        System.out.printf("Имя попугая: %s, возраст попугая: %d года, порода попугая: %s, размер словаря: %d слов\n",
                parrot.getName(), parrot.getAge(), parrot.getBreed(), parrot.getVocabulary());

    }
}
