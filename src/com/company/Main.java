package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.println(DateBase.getTrainersCount());
//        System.out.println(DateBase.getStudentsHavingChar());

//        System.out.println(DateBase.insertCountry(2,"USA",0701,400000000,"английский"));
//        System.out.println(DateBase.insertCountry(3,"EU",555,300000000,"английский"));
//        System.out.println(DateBase.insertCountry(4,"Germany",666,250000000,"немецкий"));
//        System.out.println(DateBase.insertCountry(5,"England",777,1000000,"английский"));


//        DateBase.insertCity(1,"Bishkek",1,300000);
//        DateBase.insertCity(2,"Вашингтон",2,7700000);
//        DateBase.insertCity(3,"Berlin",4,3600000);
//        DateBase.insertCity(4,"London",3,9000000);
//        DateBase.insertCity(5,"London",5,9000000);
//        System.out.println(DateBase.getCitiesWithCountries());
        User user = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        user.setLogin(sc.nextLine());
        System.out.println("Enter password:");
        user.setPassword(sc.nextLine());
//        System.out.println("Enter email:");
//        user.setEmail(sc.nextLine());
//
//        register(user);

        authorize(user.getLogin(),user.getPassword());
    }

    public static void register(User user) {
        if (UserDB.addUser(user)) {
            System.out.println("Registered successfully");
        }
        else System.out.println("Registration failed");
    }

    public static void authorize(String username, String password){
        User user = UserDB.getUserByUsername(username);
        if(user == null){
            System.out.println("Username or password is incorrect");
        }
        else if(user.getPassword().equals(UserDB.encodePassword(password))){
            UserDB.addUserLog(user,"SUCCESS");
            System.out.println("Logged is successfully");
        }
        else{
            UserDB.addUserLog(user,"FAIL");
            System.out.println("Username or password is incorrect");
        }
    }
}
