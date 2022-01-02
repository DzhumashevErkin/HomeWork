package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        News news = new News();
//        System.out.println("Введите заголовок: ");
//        news.setHeading(sc.nextLine());
//        System.out.println("Введите текст новости: ");
//        news.setContent(sc.nextLine());
//        if(NewsDB.createNews(news)) System.out.println("Новость создана");
//        NewsDB.getNewsById(1).showHeadingAndContent();
        NewsDB.deleteNewsById(1);
//        NewsDB.changeHeadingAndContentInNewsById(1,"QQ","123456789");
    }



}
