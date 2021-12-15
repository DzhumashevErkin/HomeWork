package com.company.C;

public class Main {
    public static void main(String[] args) {
//        1. Что такое модификатор final и зачем он нам?
//          final делает поле/метод/класс неизменяемым и ненаследуемым
//          когда мы уверены что метод/класс идеален и его не нужно расщирять
//          нужен для безопасности, чтобы никто не мог изменить
//          Как я понял (поправь если неправильно) например мы создали класс,
        //  который реализует определенную логику через методы (например аудентификацию или всякие проверки)
        // а потом чтобы другой не испортил или не взломал мы делаем метод final
//        2. К каким элементам класса можно применять final?
//          поля,методы,классы, наверное и интерфейсы,enum, и кучу еще остального
//        3. Объясните применение final для разных элементов.
//          поле не меняется
        //  метод не переопределяется
        //  если класс(то всё что в классе автоматом final)
        //  любое final не наследуется
        // примитивные типы не меняют значение
        // ссылочные типы меняют значение , но всегда ссылаются на один объект в памяти
//        4. Как вы понимаете не примитивный (ссылочный тип) данных?
//          ссылка на объект в памяти
//        5. В чем отличие между примитивным и не примитивными типами данных?
        //  примитивные типы ограничены в функциональности
        //  ссылочные типы намного функциональней. Приятный бонус, при передаче в метод в параметры
        // ссылочный тип, то ссылочный тип изменится(коротко, но ты меня понял)
        // Тогда если есть Wrapper классы, зачем примитивные? Сам не до конца понял, но со слов основателя

        //Wrapper types versus primitive types
        //Bill Venners: Why are there primitive types in Java? Why wasn't everything just an object?
        //
        //James Gosling: Totally an efficiency thing. There are all kinds of people who have built systems where ints and that are all objects.
        // There are a variety of ways to do that, and all of them have some pretty serious problems.
        // Some of them are just slow, because they allocate memory for everything.
        // Some of them try to do objects where sometimes they are objects, sometimes they are not (which is what the standard LISP system did), and then things get really weird.
        // It kind of works, but it's strange.
        //
        //Just making it such that there are primitive and objects, and they're just different. You solve a whole lot of problems.
    }
}
