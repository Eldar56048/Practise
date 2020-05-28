package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();

        users.add(new User("Robert","Man", "Single"));
        users.add(new User("John", "Man", "Married"));
        users.add(new User("Laura", "Women", "Married"));
        users.add(new User("Diana", "Women", "Single"));
        users.add(new User("Mike", "Man", "Single"));
        users.add(new User("Bobby", "Man", "Single"));
        CriteriaFactory factory=new CriteriaFactory();
        Criteria man = new CriteriaMan();
        Criteria women = new CriteriaWomen();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, man);


        System.out.println("\nSingle Mans: ");
        printUsers( factory.getCriteria("Man",users));


    }

    public static void printUsers(List<User> users){

        for (User user : users) {
            System.out.println("  Name : " + user.getName() + ", Gender : " + user.getGender() + ", Marital Status : " + user.getStatus());
        }
    }
}

