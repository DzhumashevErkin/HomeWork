package B;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        //Доп задание
        System.out.println("Введите название класса:");
        String className = new Scanner(System.in).nextLine();
        Class<?> myClass = Class.forName("B." + className);
        Object figure = myClass.newInstance();
        Method method = myClass.getDeclaredMethod("draw", char.class);
        method.invoke(figure, '*');

        //Второе задание
        Square square = new Square();
        square.setSymbol('*');
        square.draw();

        System.out.println();

        Rectangle rectangle = new Rectangle();
        rectangle.setSymbol('$');
        rectangle.draw();
    }
}
