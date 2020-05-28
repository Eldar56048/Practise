package com.company;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMan implements Criteria{
    List<User> MenUsers=new ArrayList<User>();
    public CriteriaMan(){

    }
    public CriteriaMan(List<User> users){
        meetcriteria(users);
    }
    @Override
    public List<User> meetcriteria(List<User> users) {
        for(User user:users){
            if(user.getGender().equalsIgnoreCase("MAN")){
                MenUsers.add(user);
            }
        }
        System.out.println("In man criteria method");
        return MenUsers;

    }

}
