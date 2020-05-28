package com.company;

import java.util.ArrayList;
import java.util.List;

public class CriteriaWomen implements Criteria{
    List<User> WomenUsers=new ArrayList<User>();
    public CriteriaWomen(){

    }
    public CriteriaWomen(List<User> users){
        meetcriteria(users);
    }
    @Override
    public List<User> meetcriteria(List<User> users) {
        List<User> WomenUsers=new ArrayList<User>();

        for(User user:users){
            if(user.getGender().equalsIgnoreCase("WOMEN")){
                WomenUsers.add(user);
            }
        }
        System.out.println("In Women criteria method");
        return WomenUsers;
    }
}
